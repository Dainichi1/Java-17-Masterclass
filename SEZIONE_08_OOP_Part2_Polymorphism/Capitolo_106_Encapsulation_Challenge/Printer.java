package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_106_Encapsulation_Challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public void addToner (int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel > 100 || tonerLevel < 0) {
            tonerLevel = -1;
        }
    }

    public int printPages (int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        if (duplex) {
            System.out.println("mode duplex on");
        }
        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }



}
