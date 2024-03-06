package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_106_Encapsulation_Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(40,true );
        System.out.println("Initial page count = "+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",pagesPrinted, printer.getPagesPrinted());

        System.out.println("Toner level: "+printer.getTonerLevel());

    }
}
