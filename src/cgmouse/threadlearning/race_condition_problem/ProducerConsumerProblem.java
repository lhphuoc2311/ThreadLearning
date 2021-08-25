package cgmouse.threadlearning.race_condition_problem;

public class ProducerConsumerProblem {

    Store store;
    Producer producer;
    Consumer consumer;

    public ProducerConsumerProblem (){
        store = new Store();
        producer = new Producer(store);
        consumer = new Consumer(store);
        producer.start();
        consumer.start();
    }

    public static void main(String[] args) {
        ProducerConsumerProblem producerConsumerProblem = new ProducerConsumerProblem();
    }
    
}
