package ObjectOrientedProgramming.Encapsulation;

public class PlayerMain {
    public static void main(String[] args) {

        Player player = new Player("Ian");
        System.out.println("Initial health is " + player.healthRemaining());

    }
}
