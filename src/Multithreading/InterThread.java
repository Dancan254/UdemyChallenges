package Multithreading;

class A{
    int num;
    //to set the value
    public void put(int num){
        this.num = num;
        System.out.println("Put " + num);
    }
    //to return the value
    public void get(){
        System.out.println("Get " + num);
    }
}

class Producer implements Runnable{
    A a;

    public Producer(A a){
        this.a = a;
        Thread p = new Thread(this, "Producer");
        p.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            a.put(i++);
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Consumer implements Runnable{
    A a;
    public Consumer(A a){
        this.a  = a;
        Thread p = new Thread(this, "Consumer");
        p.start();
    }
    @Override
    public void run() {

    }
}
public class InterThread {

    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);

    }
}
