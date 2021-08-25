package cgmouse.threadlearning.race_condition_problem;

public class Consumer extends Thread {

    Store store = null;

    public Consumer(Store s){
        store = s;
    }

    @Override
    public void run() {
        while(true){
            try{
                long x = store.get();
                if(x > 0){
                    System.out.println("-- Product " + x + " is bought.");
                }else{
                    System.out.println("Consumer is waiting fo new product");
                }
            }catch (Exception e){

            }
        }
    }
    
}
