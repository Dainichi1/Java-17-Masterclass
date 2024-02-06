package SEZIONE_05.Capitolo_44_if_then_else_Challenge;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your new final score was "+ newFinalScore);
        }

    }
}
