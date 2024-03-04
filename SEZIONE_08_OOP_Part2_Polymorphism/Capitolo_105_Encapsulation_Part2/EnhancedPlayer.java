package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_105_Encapsulation_Part2;

public class EnhancedPlayer {

    private String fullName;
    private int healtPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healtPercentage = 1;
        } else if (health > 100) {
            this.healtPercentage = 100;
        } else {
            this.healtPercentage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealt (int damage) {

        healtPercentage = healtPercentage - damage;
        if (healtPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healtPercentage;
    }

    public void restoreHealth(int extraHealth) {

        healtPercentage = healtPercentage + extraHealth;
        if (healtPercentage > 100) {
            System.out.println("Player restored to 100%");
            healtPercentage = 100;
        }
    }

}
