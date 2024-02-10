package SEZIONE_06.Capitolo_62_Sum_3_and_5_Challenge;

public class Main {

    public static void main(String[] args) {

        int counter = 0;

        int sum = 0;

        for (int i = 1; i <= 1000; i++) {

            if (isDivisible3Or5(i)) {
                sum += i;
                counter++;
                System.out.println("the number is: "+i);

                if (counter==5) {
                    System.out.println("\nFound 5 - exiting the for loop");
                    break;
                }
            }
        }

        System.out.println("\nThe sum is: "+sum);
    }

    public static boolean isDivisible3Or5 (int wholeNumber) {

        return wholeNumber % 3 == 0 && wholeNumber % 5 == 0;
    }
}
