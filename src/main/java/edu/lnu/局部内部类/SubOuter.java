package edu.lnu.局部内部类;

public class SubOuter extends Outer {

    class Inner{
        public Inner(){
            System.out.println("Inner of SubOuter");
        }
    }

    public static void main(String[] args) {
        SubOuter.Inner inner = new SubOuter().new Inner();
        Outer.Inner inner1 = new Outer().new Inner();
    }

}
