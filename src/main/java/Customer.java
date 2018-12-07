public class Customer implements Cloneable {

    private String name;
    private int age = 1;

    static {
        System.out.println("static block");
    }

    private Customer(){
        this("unknown" , 0);
        System.out.println("call default constructor");
    }

    public Customer(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("call second constructor.");
    }

    public Object clone() throws CloneNotSupportedException{return  super.clone();}

    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Customer))
            return false;
        final Customer other = (Customer)o;
        if(this.name == other.name && this.age == other.age)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "name:" + this.name + ",age:" + this.age;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {
        Class objClass = Class.forName("Customer");
        System.out.println();
        Customer c1 = (Customer) objClass.newInstance();
        System.out.println("c1:" + c1);
/*
        Customer c2 = new Customer("Tom" , 20);
        System.out.println("c2:" + c2);

        Customer c3 = (Customer) c2.clone();
        System.out.println("c3:" +   c3);

        System.out.println(c2 == c3 ? true : false);
        System.out.println(c2.equals(c3) ? true : false);*/
    }
}
