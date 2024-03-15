package SEZIONE_09_Arrays.Capitolo_122_Arrays_Challenge_Exercise;

import java.util.Arrays;
import java.util.Random;

public class Array {



    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static void sortDescending(int[] array) {
        // Utilizzo di Arrays.sort con un comparatore per ordinare in modo decrescente
        Arrays.sort(array);
        // Inversione dell'array per avere l'ordine dal più grande al più piccolo
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}

