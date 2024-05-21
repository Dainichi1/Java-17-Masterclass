package SEZIONE_11_Abstraction.Capitolo_158_Whats_new_since_JDK8;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jet());
    }

    private static void inFlight (FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
