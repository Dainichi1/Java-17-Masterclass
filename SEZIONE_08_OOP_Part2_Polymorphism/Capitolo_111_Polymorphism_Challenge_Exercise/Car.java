package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_111_Polymorphism_Challenge_Exercise;

public class Car {

    private String description;

    public Car(String description) {

        this.description = description;
    }

    public void startEngine () {
        System.out.println("Car -> startEngine");

    }

    protected void runEngine () {
        System.out.println("Car -> runEngine of");
    }

    public void drive() {
        System.out.println("Car -> driving, type is "+getClass().getSimpleName());
        runEngine();
    }


}
