package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_101_Composition_Part1;

public class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton () {
        System.out.println("Power button pressed");
    }
}
