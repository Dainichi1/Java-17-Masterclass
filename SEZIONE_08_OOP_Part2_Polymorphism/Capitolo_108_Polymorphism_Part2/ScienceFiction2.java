package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_108_Polymorphism_Part2;

public class ScienceFiction2 extends Movie2{

    public ScienceFiction2(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad aliens do bad stuff",
                "Space guys chase aliens",
                "Planet Blows up");
    }
}
