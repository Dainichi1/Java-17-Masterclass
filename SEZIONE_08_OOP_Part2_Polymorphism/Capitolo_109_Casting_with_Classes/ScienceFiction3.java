package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_109_Casting_with_Classes;

public class ScienceFiction3 extends Movie3{

    public ScienceFiction3(String title) {
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

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction thriller");
    }
}
