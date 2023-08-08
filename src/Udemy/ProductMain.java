package Udemy;


public class ProductMain {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Apple", "240");
        Moniter theMoniter = new Moniter("27inch Beast", " Apple", 27, "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("Bj-200", "Apple", 4, 6,"v2.44");

        PersonalComputer thePc = new PersonalComputer("2208", "Apple", theCase, motherBoard, theMoniter);
//        thePc.getMonitor().drawPixelAt(10, 10, "Red");
//        thePc.getMotherBoard().loadProgram("Mac OS");
//        thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();

    }
}
