package SEZIONE_12_Generics.Capitolo_167_168_Generic_Class_Challenge;

public class River extends Line{
    private String name;

    public River(String name, String ... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}
