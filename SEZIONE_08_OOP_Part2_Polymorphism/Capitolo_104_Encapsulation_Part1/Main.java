package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_104_Encapsulation_Part1;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";


        int damage = 10;
        player.loseHealt(damage);
        System.out.println("Remaining health = "+player.healthRemaining());
        player.health = 200;
        player.loseHealt(11);
        System.out.println("Remaining health = "+player.healthRemaining());
    }
}
