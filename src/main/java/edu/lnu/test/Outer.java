package edu.lnu.test;

public class Outer {

     class InnerTool{
        public int add(int a , int b){
            return a + b;
        }
    }

    private InnerTool tool = new InnerTool();

    public void add(int a , int b , int c){
        tool.add(tool.add(a , b) , c);
    }

}
