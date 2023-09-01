package ObjectOrientedProgramming.Interface;

public class NiceCar implements Engine, Brake{
    //it is going to have an internal engine of its own
    private Engine engine;
    private Media cdPlayer;

    public NiceCar() {
       engine = new PowerEngine();
       cdPlayer = new CDPlayer();
    }

    public NiceCar(Engine engine, Media cdPlayer) {
        this.engine = engine;
        this.cdPlayer = cdPlayer;
    }


    public void brake() {
    }
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic(){
        cdPlayer.start();
    }
    public void stopMusic(){
        cdPlayer.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
