package ObjectOrientedProgramming.Encapsulation;

public class Player {
    private String name;
    private int healthPercentage;
    private String weapon;

    //creating constructor

    public Player(String name) {
        //this constructor holds the default weapon and health
        this(name, 100, "Sword");
    }

    public Player(String name, int healthPercentage, String weapon) {

        this.name = name;
        if (healthPercentage <= 0) {this.healthPercentage = 1;}
        else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;
        if (healthPercentage <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
      healthPercentage += extraHealth;

      if (healthPercentage > 100){
          System.out.println("Player restored to 100%");
          healthPercentage = 100;
      }
    }
}
