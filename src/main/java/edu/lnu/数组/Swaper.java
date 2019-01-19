package edu.lnu.数组;

public class Swaper {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void swap(int[] a , int[] b){
        for(int i = 0; i < a.length; i++){
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int[] a = {1 , 2 , 3};
        int[] b = {4 , 5 , 6};
        swap(a , b);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        swap(a[0] , b[0]);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

}
