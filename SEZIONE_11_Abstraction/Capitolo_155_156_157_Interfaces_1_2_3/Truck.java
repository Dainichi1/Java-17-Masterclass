package SEZIONE_11_Abstraction.Capitolo_155_156_157_Interfaces_1_2_3;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates recorded");

    }
}
