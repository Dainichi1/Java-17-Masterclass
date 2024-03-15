package SEZIONE_09_Arrays.Capitolo_122_Arrays_Challenge_Exercise;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = Array.getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Array.sortDescending(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }
}
