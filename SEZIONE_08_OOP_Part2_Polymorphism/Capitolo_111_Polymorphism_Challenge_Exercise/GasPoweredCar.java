package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_111_Polymorphism_Challenge_Exercise;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",cylinder);;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}
