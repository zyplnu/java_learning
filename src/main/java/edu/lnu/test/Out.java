package edu.lnu.test;

public class Out {

    int v = 1;

    class Inner{
        int v = 2;
        public void test(){
            System.out.println(v);
            System.out.println(this.v);
            System.out.println(Out.this.v);
        }

    }

    public static void main(String[] args) {
        new Out().new Inner().test();
    }

}
