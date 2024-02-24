package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_36_Pool_Area;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
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
