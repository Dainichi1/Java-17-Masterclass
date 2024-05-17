package SEZIONE_10_List_ArrayList_LinkedList.Capitolo_143_Autoboxing_and_Unboxing_Related_to_Arrays_and_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preferito ma non necessario
        Integer deprecatedBoxing = new Integer(15); // deprecato
        int unboxedInt = boxedInt.intValue(); // non necessario

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println((autoBoxed.getClass().getName()));
        // System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getDoubleObject();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.0;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger (int i) {
        return i;
    }

    private static ArrayList<Integer> getList (Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
}
