package SEZIONE_11_Abstraction.Capitolo_150_151_Abstract_Classes_1_2;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move (String speed);
    public abstract void makeNoise();

}
