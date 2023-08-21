package ObjectOrientedProgramming.Composition;


public class ProductMain {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Apple", "240");
        Monitor theMonitor = new Monitor("27inch Beast", " Apple", 27, "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("Bj-200", "Apple", 4, 6,"v2.44");

        PersonalComputer thePc = new PersonalComputer("2208", "Apple", theCase, motherBoard, theMonitor);
//        thePc.getMonitor().drawPixelAt(10, 10, "Red");
//        thePc.getMotherBoard().loadProgram("Mac OS");
//        thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();
        motherBoard.loadProgram("MacOs");

    }
}
