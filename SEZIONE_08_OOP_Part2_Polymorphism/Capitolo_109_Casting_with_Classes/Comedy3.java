package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_109_Casting_with_Classes;

public class Comedy3 extends Movie3{

    public Comedy3(String title) {
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

    public void watchComedy() {
        System.out.println("Watching a Comedy");
    }
}
