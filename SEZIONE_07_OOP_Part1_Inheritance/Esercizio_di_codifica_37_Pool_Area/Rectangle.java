package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_37_Pool_Area;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0.0) {
            width = 0.0;
        }
        if (length <0.0) {
            length = 0.0;
        }

        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
