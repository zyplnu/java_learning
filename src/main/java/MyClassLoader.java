
import java.io.*;
import java.lang.reflect.Field;

public class MyClassLoader extends ClassLoader{

    private String name;

    private String path = "d:\\";

    private final String fileType = ".class";

    public MyClassLoader(String name) {
        super();
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent , String name){
        super(parent);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }

    protected Class findClass(String name) throws ClassNotFoundException {
        byte[] data = loadClassData(name);
        return defineClass(name , data , 0 , data.length);
    }

    /**
     * 把类的二进制数据读入到内存中
     * @param name
     * @return
     */
    private byte[] loadClassData(String name) throws ClassNotFoundException {
        FileInputStream fis = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        //com.abc.Sample --> com\abc\Sample
        name = name.replaceAll("\\." , "\\\\");
        try {
            fis = new FileInputStream(new File(path + name + fileType));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while((ch = fis.read()) != -1){
                baos.write(ch);
            }
            data = baos.toByteArray();
            fis.close();
            baos.close();
        } catch (IOException e) {
            throw new ClassNotFoundException("Class is not found:" + name , e);
        }
        return data;
    }

    /**
     * 从内存中加载类并创建类的实例
     * @param classLoader
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class cla = classLoader.loadClass("Sample");
        Object obj = cla.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("D:\\myapp\\serverlib\\");

        /*MyClassLoader loader2 = new MyClassLoader(loader1 , "loader2");
        loader2.setPath("D:\\myapp\\clientlib\\");
        MyClassLoader loader3 = new MyClassLoader(null , "loader3");
        loader3.setPath("D:\\myapp\\otherlib\\");

        test(loader2);
        test(loader3);*/

        Class obj = loader1.loadClass("Sample");
        Object object = obj.newInstance();
       /*  Sample sample = (Sample)object;
        System.out.println(sample.v1);*/

        Field f = obj.getField("v1");
        int v1 = f.getInt(object);
        System.out.println("v1=" + v1);

    }
}
