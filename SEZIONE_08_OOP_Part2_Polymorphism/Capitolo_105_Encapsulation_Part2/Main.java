package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_105_Encapsulation_Part2;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//
//        int damage = 10;
//        player.loseHealt(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//        player.health = 200;
//        player.loseHealt(11);
//        System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        EnhancedPlayer jon = new EnhancedPlayer("Jon",200,"Sword");
        System.out.println("Initial health is "+tim.healthRemaining());
        System.out.println("Initial helath is "+jon.healthRemaining());
    }
}
