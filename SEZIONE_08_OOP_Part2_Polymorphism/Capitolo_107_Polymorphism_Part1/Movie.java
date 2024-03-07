package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_107_Polymorphism_Part1;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+instanceType + " film");
    }
}
