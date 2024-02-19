package SEZIONE_05_Expressions_Statements_and_More.Esercizio_di_codifica_12_Playing_Cat;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,55));
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int max2 = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max2;
    }
}
