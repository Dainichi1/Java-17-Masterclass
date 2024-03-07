package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_108_Polymorphism_Part2;

public class Movie2 {

    private String title;

    public Movie2(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType +" film");
    }

    public static Movie2 getMovie (String type, String title) {

        return  switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure2(title);
            case 'C' -> new Comedy2(title);
            case 'S' -> new ScienceFiction2(title);
            default ->  new Movie2(title);
        };
    }
}
