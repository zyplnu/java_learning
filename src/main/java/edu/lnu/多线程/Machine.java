package edu.lnu.多线程;

import java.io.IOException;
import java.util.Scanner;

public class Machine extends Thread {

    private int a = 0;
    private static int count = 0;

    public void start(){
        super.start();
        System.out.println(currentThread().getName() + ":" + count );
    }

    public void run(){
        for(int a = 0; a < 50; a++){
            System.out.println(super.currentThread().getName() + ":" + a);
            try{
                sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        /*Machine machine = new Machine();
        Machine machine1 = new Machine();
        machine.start();
        machine1.start();
        machine.start();
        System.in.read();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        */
        int[] aa = new int[4];
        aa[0] = 1;

        int[] aab = {1,2,3,4,};
        int[] aac = new int[]{1,2,3,4};
        System.out.println(aab.length);

    }

}
