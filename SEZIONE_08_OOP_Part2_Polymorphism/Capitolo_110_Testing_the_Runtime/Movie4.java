package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_110_Testing_the_Runtime;

public class Movie4 {

    private String title;

    public Movie4(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType +" film");
    }

    public static Movie4 getMovie (String type, String title) {

        return  switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure4(title);
            case 'C' -> new Comedy4(title);
            case 'S' -> new ScienceFiction4(title);
            default ->  new Movie4(title);
        };
    }
}
