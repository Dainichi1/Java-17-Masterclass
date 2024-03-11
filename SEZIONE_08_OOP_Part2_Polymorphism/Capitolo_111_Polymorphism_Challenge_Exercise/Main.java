package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_111_Polymorphism_Challenge_Exercise;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("Ferrari",15.4,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla",568,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("Ferrari ibrida", 16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace (Car car) {
        car.startEngine();
        car.drive();
    }
}
