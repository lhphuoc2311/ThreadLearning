package cgmouse.threadlearning.basic;

public class ThreadTestDrive {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Number of threads: " + Thread.activeCount());
        Thread thread = Thread.currentThread();

        System.out.println("Current Thread " + thread.getName());
    }
    
}
