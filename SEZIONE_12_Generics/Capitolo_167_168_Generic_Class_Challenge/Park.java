package SEZIONE_12_Generics.Capitolo_167_168_Generic_Class_Challenge;

public class Park extends Point{

    private String name;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}
