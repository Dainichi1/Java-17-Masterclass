package SEZIONE_11_Abstraction.Capitolo_155_156_157_Interfaces_1_2_3;

public class Jet implements FlightEnabled, Trackable{

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
