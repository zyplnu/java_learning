package edu.lnu.多线程;

public abstract class Animal {

    protected abstract  void test();

    public static void test1(){

    }

    public void showMe(){
        System.out.println("animal showMe");
    }

    public void print(){
        showMe();
    }
}
