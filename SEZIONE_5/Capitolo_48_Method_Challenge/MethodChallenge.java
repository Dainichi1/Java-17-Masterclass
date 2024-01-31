package SEZIONE_5.Capitolo_48_Method_Challenge;

public class MethodChallenge {

    public static void main(String[] args) {
        int score = 1500;
        int highScore = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", highScore);
        score = 1000;
        highScore = calculateHighScorePosition(score);
        displayHighScorePosition("Mark", highScore);
        score = 500;
        highScore = calculateHighScorePosition(score);
        displayHighScorePosition("Jhon", highScore);
        score = 100;
        highScore = calculateHighScorePosition(score);
        displayHighScorePosition("Rita", highScore);
        score = 25;
        highScore = calculateHighScorePosition(score);
        displayHighScorePosition("Laura", highScore);
    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
            System.out.println(playerName+" managed to get into position "
                    +playerPosition+" on the high score list");
    }

    public static int calculateHighScorePosition (int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
                result = 3;
        }
        return result;
    }
}
