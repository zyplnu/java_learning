package edu.lnu.内部类;

public class A {

    private int a1;
    private static int v2;

    A a = new A();

    public static class B{
        //int b1 = a1;
        int b2 = A.v2;
        int b3 = new A().a1;
        int v2;
        static int v3;

        public B() {
            b2 = v2;
        }
    }

    public class Tester{
        A.B b = new A.B();
        public void test(){
            b.v2 = 12;
            B.v3 = 4;
        }
    }

}
