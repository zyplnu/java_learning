package edu.lnu.多线程;

public class DeadMachine extends Thread {

    public void run() {
        for (int a = 0; a < 3; a++) {
            System.out.println(currentThread().getName() + ":" + a);
            if (a == 1 && currentThread().getName().equals("m1")) {
                throw new RuntimeException("Wrong from Machine");
            }

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
       int[] x = new int[3];
       x = new int[4];
        System.out.println(x.length);
    }

}
