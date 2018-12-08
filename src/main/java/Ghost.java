import java.util.HashMap;
import java.util.Map;

/**
 * 测试垃圾回收器finalize（）方法
 */
public class Ghost {

    //实例缓存
    private static final Map<String , Ghost> ghosts = new HashMap<>();

    private final String name;

    public Ghost(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 如果实例缓存中存在与name参数相匹配的Ghost对象，将其返回
     * 否则新创建对象，加入到缓存中
     * @param name
     * @return
     */
    public static Ghost getInstance(String name){
        Ghost ghost = ghosts.get(name);
        if(ghost == null){
            ghost = new Ghost(name);
            ghosts.put(name , ghost);
        }
        return ghost;
    }

    public static void removeInstance(String name){
        ghosts.remove(name);//从缓存中删除name参数指定的Ghost对象
    }

    protected void finalize() throws Exception {
        ghosts.put(name , this);
        System.out.println("execute finalize");
        throw new Exception("Just Test");
    }

    public static void main(String[] args) throws InterruptedException {
        Ghost ghost = Ghost.getInstance("I am Back");
        System.out.println(ghost);
        String name = ghost.getName();
        ghost = null;
        Ghost.removeInstance(name);
        System.gc();
        //把CPU让给垃圾回收线程
        Thread.sleep(300);
        ghost = Ghost.getInstance("I am Back");
        System.out.println(ghost);
    }
}
