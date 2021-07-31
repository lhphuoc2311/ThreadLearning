package cgmouse.threadlearning.basic;

public class RunnableClassUsing {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        
        Thread thread = new Thread(runnableThread);
        thread.start();

        System.out.println("I'm a main thread.");
        System.out.println("Hello");

        //COUNTING Thread
        System.out.println("Thread count of application: " + Thread.activeCount());

        //Current Thread
        Thread thread2 = Thread.currentThread();
        System.out.println("Name of current thread: " + thread2.getName());
    }
    
}
