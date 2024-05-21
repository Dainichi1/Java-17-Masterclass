package SEZIONE_11_Abstraction.Capitolo_159_Whats_new_since_JDK8_2;


public class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
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
}
