package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_88_Inheritance_Part1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

    }

    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}
