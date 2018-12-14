package edu.lnu.回调;

public class Base {

    private int speed;

    /**
     * 调节速度
     * @param speed
     */
    public void adjust(int speed){
        this.speed = speed;
        System.out.println("调节速度");
    }

}
