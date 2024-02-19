package SEZIONE_06_Control_Flow.Capitolo_59_A_Switch_Expression_Challenge;

public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

    public static void printDayOfWeek (int day) {
        String dayOfTheWeek =  switch (day) {
            case 0 -> { yield "Monday"; }
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid Day";
            };
        System.out.println(day + " stands for: "+ dayOfTheWeek);
        }
    }
