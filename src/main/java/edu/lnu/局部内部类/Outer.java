package edu.lnu.局部内部类;

public class Outer {

    Inner inner;

    public Outer() {
        inner = new Inner();
    }

    public class Inner{
        public Inner() {
            System.out.println("Inner of Outer");
        }
    }

}
