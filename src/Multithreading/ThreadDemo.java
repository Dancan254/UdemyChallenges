package Multithreading;

class Hi  extends Thread{
    
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            //suspending thread, this implies, printing hi after 0.5s
            try{ Thread.sleep(500); }catch (Exception e) {}
        }
    }
}

class Hello extends Thread{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try{ Thread.sleep(500); }catch (Exception e) {}
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        //to prevent uneven threading, create a time gap
        try{ Thread.sleep(10); }catch (Exception e) {}
        hello.start();
    }
}
