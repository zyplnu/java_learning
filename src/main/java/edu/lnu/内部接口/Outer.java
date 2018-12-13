package edu.lnu.内部接口;

public class Outer {

    public  interface Tool{
        public int add(int a , int b);

    }

    private Tool tool = new Tool() {
        @Override
        public int add(int a, int b) {
            return a + b;
        }
    };

}
