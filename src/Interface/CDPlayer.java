package Interface;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("RNB music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
