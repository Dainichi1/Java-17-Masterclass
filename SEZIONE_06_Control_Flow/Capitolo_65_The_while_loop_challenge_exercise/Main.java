package SEZIONE_06_Control_Flow.Capitolo_65_The_while_loop_challenge_exercise;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 4;
        while (i <= 20) {
            i++;
            if (isEvenNumber(i)) {
                if (sum ==  5) {
                    break;
                }
                sum ++;
                System.out.println("Even number: "+i);
            }
        }
        System.out.println("Total even number: "+sum);
    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }
}
