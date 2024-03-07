package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_107_Polymorphism_Part1;

public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy endings");
    }
}
