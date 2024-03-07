package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_109_Casting_with_Classes;

public class Movie3 {

    private String title;

    public Movie3(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType +" film");
    }

    public static Movie3 getMovie (String type, String title) {

        return  switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure3(title);
            case 'C' -> new Comedy3(title);
            case 'S' -> new ScienceFiction3(title);
            default ->  new Movie3(title);
        };
    }
}
