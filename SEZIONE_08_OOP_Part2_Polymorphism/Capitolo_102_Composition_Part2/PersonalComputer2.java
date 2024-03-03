package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_102_Composition_Part2;


public class PersonalComputer2 extends Product2 {

    private ComputerCase2 computerCase;
    private Monitor2 monitor;
    private MotherBoard2 motherboard;

    public PersonalComputer2(String model, String manufacturer, ComputerCase2 computerCase,
                             Monitor2 monitor, MotherBoard2 motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelArt(1200,50,"yellow");
    }

    public void powerUp () {
        computerCase.pressPowerButton();
        drawLogo();
    }


}
