package SEZIONE_11_Abstraction.Capitolo_158_Whats_new_since_JDK8_1;

public class Jet implements FlightEnabled, Trackable {

    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing\n");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates recorded");

    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName()+" transitioning");
        return FlightEnabled.super.transition(stage);
    }
}
