

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

    public static void main(String[] args) {
        a++;
        System.out.println("a=" + a);
    }

}
