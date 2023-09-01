package ObjectOrientedProgramming.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("->EC starting");
    }

    @Override
    public void stop() {
        System.out.println("->> Ec stopping");
    }

    @Override
    public void acc() {
        System.out.println("->> EC accelerating");
    }
}
