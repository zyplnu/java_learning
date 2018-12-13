package edu.lnu.局部内部类;

public class A{

    int a;
    static int b;

    public static class B{
        int c;
    }

    public class C{
        int c;
        int b;

    }

    public void test(){
        final int d;
        class D{
            int da;
        }
    }



}
