package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_34_Carpet_Cost_Calculator;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0.0) {
            width = 0.0;
        }
        if (length < 0.0) {
            length = 0.0;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea () {
        return width * length;
    }




}
