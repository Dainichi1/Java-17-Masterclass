package SEZIONE_06_Control_Flow.Capitolo_74_Min_and_Max_Challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int loop = 0;


        while (true) {
            System.out.println("Inserisci un numero: ");
            String nextInt = scanner.nextLine();
            try {

                int number = Integer.parseInt(nextInt);

                if (number < min || loop==0) {
                    min = number;
                }

                if (number > max || loop == 0) {
                    max = number;
                }
                loop++;
                System.out.println("Il minimo è: "+min+" e il massimo è: "+max);

            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loop > 0) {
            System.out.println("min = "+min+", max = "+max);
        } else {
            System.out.println("Inserimento non valido");
        }
    }
}

