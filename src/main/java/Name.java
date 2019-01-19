import java.io.ByteArrayInputStream;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
        byte[] buff = new byte[]{2,15,67,-1,-9,9};
        ByteArrayInputStream in = new ByteArrayInputStream(buff , 1, 4);
        int data = in.read();
        while(data != -1){
            System.out.println(data + " " );
            data = in.read();
        }
        byte b1 = -9;
        int a1 = b1;
        System.out.println(a1);
    }

}
