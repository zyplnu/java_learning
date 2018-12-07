import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Gender implements Serializable {

    private final Character sex;

    private final transient String description;

    public Character getSex() {
        return sex;
    }

    public String getDescription() {
        return description;
    }

    //实例缓存
    private static final Map<Character , Gender> instanceBySex = new HashMap<>();

    /**
     * 把构造方法声明为private，禁止外部程序创建Gender的实例
     */
    private Gender(Character sex, String description) {
        this.sex = sex;
        this.description = description;
        instanceBySex.put(sex , this);
        System.out.println(instanceBySex.size());
    }

    public static final Gender FEMALE = new Gender(new Character('F') , "Female");
    public static final Gender MALE = new Gender(new Character('M') , "Male");

    public static Gender getInstance(Character sex){
        Gender result = instanceBySex.get(sex);
        if(result == null)
            throw new NoSuchElementException(sex.toString());
        return result;
    }

    @Override
    public String toString() {
        return description;
    }

    private Object readResolve(){
        return getInstance(sex);
    }
}
