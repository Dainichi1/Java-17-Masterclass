package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_77_Introduction_to_Classes_Using_Getter_Methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();
    }
}
