package SEZIONE_06.Esercizio_di_codifica_28_Input_calculator;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
                inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner (System.in);
            int sum = 0;
            long media= 0;
            int inserimenti = 1;

            while (true) {
                System.out.println("Inserisci un numero o un carattere per uscire");
                String numero = scanner.nextLine();
                try {
                    int numerovalido = Integer.parseInt(numero);
                    sum += numerovalido;
                    media = Math.round(( (double)  sum /inserimenti));
                    inserimenti++;
                } catch (NumberFormatException nfe) {
                    break;
                }
            }
            if (inserimenti >= 1) {
                System.out.println("SUM = "+sum+" e la media è: "+media);
            }
    }
}

