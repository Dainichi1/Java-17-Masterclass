package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_36_Cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder (double radius, double height) {
        super (radius);
        if (height < 0.0) {
            height = 0.0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
