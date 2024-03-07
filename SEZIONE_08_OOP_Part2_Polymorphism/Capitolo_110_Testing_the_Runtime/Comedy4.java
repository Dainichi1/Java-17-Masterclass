package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_110_Testing_the_Runtime;

public class Comedy4 extends Movie4 {

    public Comedy4(String title) {
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
