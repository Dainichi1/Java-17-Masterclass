package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_110_Testing_the_Runtime;

public class NextMain {

    public static void main(String[] args) {

        Movie4 movie = Movie4.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure4 jaws = (Adventure4) Movie4.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy =  Movie4.getMovie("C","Airplane");
        Movie4 comedyMovie = (Comedy4) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie4.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy4("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie4.getMovie("A","Jaws");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy4 c = (Comedy4) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure4) {
            ((Adventure4) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction4 syfy) {
            syfy.watchScienceFiction();
        }
    }
}
