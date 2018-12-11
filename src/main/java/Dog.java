import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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
        /*a++;
        System.out.println("a=" + a);
        Class cl = Class.forName("Customer");
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            if(constructor.getModifiers() == Modifier.PRIVATE){
                constructor.setAccessible(true);
                Customer customer = (Customer) cl.newInstance();
                System.out.println(customer.toString());
            }
        }*/

        /*Map<String , String> map = new HashMap<>();
        map.put(null , null);
        map.put("test" , null);

        for(Map.Entry<String , String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/

        Map<String , String> table = new Hashtable<>();
        //table.put(null , null);
        table.put("table" , null);
        for(Map.Entry<String , String> entry : table.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
