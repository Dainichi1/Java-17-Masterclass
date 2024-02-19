package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_78_Classes_Using_Setters_and_Creating_Objects;


public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");


        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
