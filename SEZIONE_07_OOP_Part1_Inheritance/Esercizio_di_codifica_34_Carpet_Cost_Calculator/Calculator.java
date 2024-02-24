package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_34_Carpet_Cost_Calculator;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost () {
        double total;
        total = (floor.getArea() * carpet.getCost());
        return total;
    }
}
