package SEZIONE_06_Control_Flow.Capitolo_64_The_while_and_do_while_statement;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}
