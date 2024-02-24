package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_88_Inheritance_Part1;

public class Animal {

    private String type;
    private String size;
    private int weight;

    public Animal() {

    }

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void move (String speed) {
        System.out.println(type + " moves "+speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }


}
