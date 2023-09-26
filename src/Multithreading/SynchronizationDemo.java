package Multithreading;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        //create two threads
        Thread t1 = new Thread(() -> {
            {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        //start the thread
        t1.start();
        t1.join();//needs exception handling

        //thread 2 will wait for thread 1 to finish since it is sync
        //otherwise the output would be a random number
        t2.start();
        t2.join();

        System.out.println("Count = " + counter.count);//2000
    }
}
