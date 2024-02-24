package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_34_Carpet_Cost_Calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0.0) {
            cost = 0.0;
        }
        this.cost = cost;
    }

    public double getCost () {
        return cost;
    }
}
