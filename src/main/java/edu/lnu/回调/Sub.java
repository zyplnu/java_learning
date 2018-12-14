package edu.lnu.回调;

public class Sub extends Base {


    private int temperature;

    private void adjustTemperature(int temperature){
        this.temperature = temperature;
    }

    private class Closure implements Adjustable{
        @Override
        public void adjust(int temperature) {
            adjustTemperature(temperature);
        }
    }

    public Adjustable getCallBackReference(){
        return new Closure();
    }

}
