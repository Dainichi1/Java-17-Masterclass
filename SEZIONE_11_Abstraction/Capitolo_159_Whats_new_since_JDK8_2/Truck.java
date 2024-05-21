package SEZIONE_11_Abstraction.Capitolo_159_Whats_new_since_JDK8_2;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates recorded");

    }
}
