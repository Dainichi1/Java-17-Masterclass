package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_109_Casting_with_Classes;

public class NextMain {
    public static void main(String[] args) {

        Movie3 movie = Movie3.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure3 jaws = (Adventure3) Movie3.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy =  Movie3.getMovie("C","Airplane");
        Movie3 comedyMovie = (Comedy3) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie3.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy3("Airplane");
        plane.watchComedy();
    }
}
