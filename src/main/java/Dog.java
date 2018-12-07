import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Dog {

    static int a = 1;

    static {
        a = 2;
    }

    static {
        a = 4;
    }


   public Dog(){
       System.out.println("Dog is loadered by " + this.getClass().getClassLoader());
   }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        a++;
        System.out.println("a=" + a);
        Class cl = Class.forName("Customer");
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            if(constructor.getModifiers() == Modifier.PRIVATE){
                constructor.setAccessible(true);
                Customer customer = (Customer) cl.newInstance();
                System.out.println(customer.toString());
            }
        }

    }

}
