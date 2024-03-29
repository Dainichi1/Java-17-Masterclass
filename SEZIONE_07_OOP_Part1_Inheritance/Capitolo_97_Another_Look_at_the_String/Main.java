package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_97_Another_Look_at_the_String;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l',
            3)); // recupera la posizione della seconda 'l'
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l',
            8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("helloWorldLower")) {
            System.out.println("Values match exactly");
        }

    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n",length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0)); // %c stampa un carattere singolo

        System.out.printf("Last char = %c %n",string.charAt(length - 1));



    }
}
