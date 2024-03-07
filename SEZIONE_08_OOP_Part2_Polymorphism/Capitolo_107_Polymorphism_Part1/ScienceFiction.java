package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_107_Polymorphism_Part1;

public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
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
