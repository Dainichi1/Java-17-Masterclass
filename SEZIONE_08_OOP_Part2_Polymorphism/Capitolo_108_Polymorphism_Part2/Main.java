package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_108_Polymorphism_Part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie2 theMovie = Movie2.getMovie("Adventure","Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A fo Adventure, C for Comedy, S for Science Fiction, or Q to Quit:\n ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie2 movie = Movie2.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
