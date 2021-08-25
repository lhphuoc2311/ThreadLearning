package cgmouse.threadlearning.race_condition_problem;

public class Store {
    int maxN = 50;//maximum number of products can be contains in the store
    long a[];//product list
    int n;//current number of products
    public Store(){
        n = 0;
        a = new long[maxN];
    }

    private boolean empty(){
        return n == 0;
    }

    private boolean full(){
        return n == maxN;
    }

    public boolean put(long x){
        if(full()) return false;

        a[n++] = x;
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }

    public long get(){
        long result = 0;

        if(!empty()){
            result = a[0];// get the product at the front of line
            for(int i = 0; i < n - 1; i ++){
                a[i] = a[i+1];
                n--;
            }
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
    
}
