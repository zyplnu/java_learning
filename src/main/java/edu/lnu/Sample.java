package edu.lnu;

public class Sample {

    public static void main(String[] args) {

        Class c;
        ClassLoader cl , cl1;

        cl = ClassLoader.getSystemClassLoader();
        System.out.println(cl);

        while (cl != null){
            cl1 = cl;
            cl = cl.getParent();
            System.out.println(cl);
        }

        try {
            c = Class.forName("java.lang.Object");
            cl = c.getClassLoader();
            System.out.println(cl);

            c = Class.forName("edu.lnu.Sample");
            cl = c.getClassLoader();
            System.out.println(cl          );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
