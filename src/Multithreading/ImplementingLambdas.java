package Multithreading;

public class ImplementingLambdas {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    System.out.println("chill");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hey " + Thread.currentThread().getPriority());
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    System.out.println("chill");
                }
            }
        });

        //thread names
        t1.setName("HI, thread");
        t2.setName("HEY, thread");//alternatively pass name in the constructor
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //thread priority, ranges from 1 to 10, 1= the least priority
        //5 normal priority, 10 = the highest priority
        //setting priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
