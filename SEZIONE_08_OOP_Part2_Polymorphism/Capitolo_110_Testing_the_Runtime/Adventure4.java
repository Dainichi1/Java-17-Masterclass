package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_110_Testing_the_Runtime;

public class Adventure4 extends Movie4 {

    public Adventure4(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}
