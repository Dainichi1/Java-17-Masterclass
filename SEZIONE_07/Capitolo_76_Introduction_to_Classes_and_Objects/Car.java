package SEZIONE_07.Capitolo_76_Introduction_to_Classes_and_Objects;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(doors+"-Door "+color+" "+make+" "+model+" "+(convertible ? "Convertible" : ""));
    }
}
