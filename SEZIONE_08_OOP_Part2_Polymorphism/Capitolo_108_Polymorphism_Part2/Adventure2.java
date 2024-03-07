package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_108_Polymorphism_Part2;

public class Adventure2 extends Movie2{

    public Adventure2(String title) {
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
}
