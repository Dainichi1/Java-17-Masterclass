package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_89_Inheritance_Part2;


public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog  ,"fast");

        Dog yorkie = new Dog ("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever",65,
                "Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

    }

    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}
