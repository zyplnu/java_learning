package edu.lnu.测验;

public class Outer {

   private int a;

    public static void main(String[] args) {

    }

    public void go(int w , final int z ,  int t){
        int p = w - z;
        final int q = w + z;


        class Inner{
//            int v = t;
            public void method(){
    //            System.out.println(w);
                System.out.println(z);
//                System.out.println(p);
                System.out.println(q);
                System.out.println(a);
//                System.out.println(t);
            }
        }
    }

}
