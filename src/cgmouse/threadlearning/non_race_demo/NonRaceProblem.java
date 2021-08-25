package cgmouse.threadlearning.non_race_demo;

import java.util.Date;

public class NonRaceProblem {
    Date d = null;
    long num1  = 0, num2 = 0;

    TimeThread t1 = new TimeThread();

    AddThread t2 = new AddThread();

    public NonRaceProblem(){
        d = new Date(System.currentTimeMillis());
        randomNumbers();
        t1.start();
        t2.start();
    }

    void randomNumbers(){
        num1 = Math.round(Math.random() * 100_000_000);
        num2 = Math.round(Math.random() * 100_000_000);
    }
    
    //inner class1: Thread for printing out the time
    class TimeThread extends Thread{
        TimeThread(){
            super();
        }

        @Override
        public void run() {
            
            while(true){
                System.out.println(d);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }

    //inner class2: Thread for printing out sum of 2 numbers

    class AddThread extends Thread{
        AddThread(){
            super();
        }

        @Override
        public void run() {
            while(true){
                System.out.println(num1 + num2);
                randomNumbers();
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

