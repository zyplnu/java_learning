package edu.lnu.数组;

public class Variable {

    public static int max(int...datas){
        if(datas.length == 0){
            return -1;
        }
        int result = 0;
        for(int a : datas){
            if(result < a){
                result = a;
            }
        }
        return result;
    }

    static int[] a;
    static Object[] o = new Object[4];
    static String s[];

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(o[3]);
//        System.out.println(s[0]);
//        int[] a[] = new int[10][10];
        Integer i  = new Integer(6);
        System.out.println(i.hashCode());
        i = 7;
        System.out.println(i.hashCode());
        System.out.println(i);
        Swaper swaper = new Swaper();
        swaper.setAge(10);
        System.out.println(swaper);
        swaper.setAge(20);
        System.out.println(swaper);
    }

}
