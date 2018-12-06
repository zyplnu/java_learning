

public class Sample {

    public int v1 = 1;

    public Sample(){
        System.out.println("Sample is loadered by " + this.getClass().getClassLoader());
        new Dog();
    }

}
