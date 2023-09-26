package Multithreading;

class HI implements Runnable{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            //suspending thread, this implies, printing hi after 0.5s
            try{ Thread.sleep(500); }catch (Exception e) {}
        }
    }
}

class Hey implements Runnable{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hey");
            try{ Thread.sleep(500); }catch (Exception e) {}
        }
    }
}
public class RunnableInterface {

    public static void main(String[] args) {

        HI hi = new HI();
        Hey hey = new Hey();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hey);

        t1.start();
        try{ Thread.sleep(10);} catch (Exception e){}
        t2.start();
    }
}
