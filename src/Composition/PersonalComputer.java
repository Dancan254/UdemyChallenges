package Composition;

//import javax.management.monitor.Monitor;
//applying composition
//assembling the personal computer from the parts
import Composition.ComputerCase;
import Composition.Moniter;
import Composition.MotherBoard;
import Composition.Product;

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private Moniter monitor;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, MotherBoard motherBoard, Moniter monitor) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixelAt(200, 50, "Purple");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public Moniter getMonitor() {
//        return monitor;
//    }
}
