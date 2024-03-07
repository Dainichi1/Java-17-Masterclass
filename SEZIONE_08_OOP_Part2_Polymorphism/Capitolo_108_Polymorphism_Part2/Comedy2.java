package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_108_Polymorphism_Part2;

public class Comedy2 extends Movie2{

    public Comedy2(String title) {
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
