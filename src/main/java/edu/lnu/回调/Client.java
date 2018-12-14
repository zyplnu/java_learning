package edu.lnu.回调;

public class Client {

    public static void main(String[] args) {
        Sub sub = new Sub();
        Adjustable ad = sub.getCallBackReference();
        ad.adjust(15);
    }

}
