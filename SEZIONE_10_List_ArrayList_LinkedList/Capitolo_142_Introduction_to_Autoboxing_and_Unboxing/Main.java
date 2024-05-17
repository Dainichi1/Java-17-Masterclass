package SEZIONE_10_List_ArrayList_LinkedList.Capitolo_142_Introduction_to_Autoboxing_and_Unboxing;

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
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.0;
    }
}

