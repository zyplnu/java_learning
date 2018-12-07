import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;

public class Name {

    private final String firstName;

    private final String lastName;

    public Name(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof  Name)) return false;

        final Name name = (Name) o;
        if(!firstName.equals(name.firstName)) return false;
        if(!lastName.equals(name.lastName)) return false;
        return true;
    }

   /* public int hashCode(){
        int result = 0;
        return result;
    }
*/
    //实例缓存
    private static final Set<SoftReference<Name>> names = new HashSet<>();

    public static Name valueOf(String firstName , String lastName){
        for(SoftReference<Name> ref : names){
            Name name = ref.get();
            if(name != null && name.firstName.equals(firstName) && name.lastName.equals(lastName)){
                return name;
            }
        }
        //如果缓存中不存在，就创建该对象，并吧它的软引用加入到实例缓存
        Name name = new Name(firstName , lastName);
        names.add(new SoftReference<Name>(name));
        return name;
    }

    public static void main(String[] args) {
        Name n1 = Name.valueOf("小红" , "王");
        Name n2 = Name.valueOf("小红" , "王");
        Name n3 = Name.valueOf("小东" , "张");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1 == n2);
    }

}
