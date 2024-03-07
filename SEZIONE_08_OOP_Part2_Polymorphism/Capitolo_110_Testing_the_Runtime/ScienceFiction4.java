package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_110_Testing_the_Runtime;

public class ScienceFiction4 extends Movie4 {

    public ScienceFiction4(String title) {
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
