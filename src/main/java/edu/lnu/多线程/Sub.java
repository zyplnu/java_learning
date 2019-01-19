package edu.lnu.多线程;

public class Sub extends Base {


    void method(){
        System.out.println("method of Sub");
    }

    static void staticMethod(){
        System.out.println("static method of Sub");
    }

    static void test(){
        staticMethod();
    }

    public static void main(String[] args) {
        Base sub1 = new Sub();
        sub1.method();
        Base.staticMethod();
        //
        Sub sub = new Sub();
        sub.method();
        Sub.staticMethod();
    }

}
