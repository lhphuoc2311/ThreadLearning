package cgmouse.threadlearning.basic;

public class Thread1Using {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        System.out.println("I'm the main thread.");
        thread1.start();

        System.out.println("Hello");

    }
    
}
