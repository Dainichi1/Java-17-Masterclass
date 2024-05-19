package SEZIONE_11_Abstraction.Capitolo_152_Abstract_Classes_3;

public class Horse extends Mammal{


    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
