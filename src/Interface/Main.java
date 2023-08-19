package Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.brake();
//        car.acc();
//        car.start();
//        car.stop();
//
//        System.out.println();
//        Brake car2 = new Car();
//        car.brake();
//        car.acc();
//        car.start();
//        car.stop();
//
//        System.out.println();
//        Engine powerEngine = new PowerEngine();
//        powerEngine.start();
//        powerEngine.acc();
//        powerEngine.stop();

        NiceCar nice = new NiceCar();
        nice.start();
        nice.startMusic();
        nice.acc();
        nice.brake();
        nice.stopMusic();
        nice.stop();
        System.out.println();
        nice.upgradeEngine();
        nice.start();
    }
}
