package SEZIONE_05_Expressions_Statements_and_More.Capitolo_53_Seconds_And_Minutes_Challenge;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println (getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int seconds) {
        int minuti;
        int secondiDiResto = 0;
        int ore = 0;
        int minutiDiResto = 0;

        if (seconds < 0) {
            System.out.println("I secondi devono essere maggiori o uguali a 0");
        } else {
            minuti = seconds / 60;
            ore = minuti / 60;
            minutiDiResto = minuti % 60;
            secondiDiResto = seconds % 60;
            getDurationString(minuti, secondiDiResto);
        }  return "'"+ore+"h "+minutiDiResto+"m "+secondiDiResto+"s'";
    }

    public static String getDurationString (int minutes, int seconds) {
        int ore = 0;
        int minutiDiResto = 0;

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("I minuti devono essere maggiori o uguali a zero " +
                    "e i secondi devono essere compresi tra 0 e 59");
        } else {
            ore = minutes / 60;
            minutiDiResto = minutes % 60;
        } return "'"+ore+"h "+minutiDiResto+"m "+seconds+"s'";
    }
}
