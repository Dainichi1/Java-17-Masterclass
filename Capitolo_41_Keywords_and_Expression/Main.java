package SEZIONE_5.Capitolo_41_Keywords_and_Expression;

public class Main {

    public static void main(String[] args) {
        double kilometri = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

    }
}
