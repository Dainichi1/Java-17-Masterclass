package SEZIONE_06_Control_Flow.Capitolo_64_The_while_and_do_while_statement;

public class Main3 {
    public static void main(String[] args) {

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
