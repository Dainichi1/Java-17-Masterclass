package SEZIONE_11_Abstraction.Capitolo_158_Whats_new_since_JDK8;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates recorded");

    }
}
