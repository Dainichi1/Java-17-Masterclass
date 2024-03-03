package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_102_Composition_Part2;

public class ComputerCase2 extends Product2 {

    private String powerSupply;

    public ComputerCase2(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase2(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton () {
        System.out.println("Power button pressed");
    }
}
