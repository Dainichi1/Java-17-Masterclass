package SEZIONE_05_Expressions_Statements_and_More.Capitolo_51_Method_Overloading;

public class MainBis {
    public static void main(String[] args) {
        System.out.println("New score is "+calculateScore("Tim", 500));
        System.out.println("New score is "+calculateScore(10));
    }

    public static  int calculateScore ( String playerName, int score) {
        System.out.println("Player "+playerName+" scored "+score+" point");
        return score * 1000;
    }

    public static  int calculateScore (int score) {
        return calculateScore("Anonymous", score);
    }

    public static  int calculateScore () {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
