package edu.lnu.内部接口;

public class MyToll implements Outer.Tool {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
