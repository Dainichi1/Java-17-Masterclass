package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_77_Introduction_to_Classes_Using_Getter_Methods;

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors+"-Door "+
                color+" "+
                make+" "+
                model+" "+
                (convertible ? "Convertible" : ""));
    }


}
