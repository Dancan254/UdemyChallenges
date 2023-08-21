package ObjectOrientedProgramming.Composition;

//applying composition
//assembling the personal computer from the parts

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, MotherBoard motherBoard, Monitor monitor) {
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
