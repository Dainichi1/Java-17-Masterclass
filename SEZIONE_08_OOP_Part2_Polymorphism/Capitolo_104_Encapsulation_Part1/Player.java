package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_104_Encapsulation_Part1;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealt (int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return  health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }


}
