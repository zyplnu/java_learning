package edu.lnu.test;

import static edu.lnu.test.A.*;

public class Tester {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.add(1 , 2, 3);
        Outer.InnerTool tool = new Outer().new InnerTool();
        A.B b = new A().new B();

    }

}
