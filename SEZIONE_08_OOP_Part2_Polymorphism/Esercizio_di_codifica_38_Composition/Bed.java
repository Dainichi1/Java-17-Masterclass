package SEZIONE_08_OOP_Part2_Polymorphism.Esercizio_di_codifica_38_Composition;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int quilt, int sheets, int height, int pillows) {
        this.style = style;
        this.quilt = quilt;
        this.sheets = sheets;
        this.height = height;
        this.pillows = pillows;
    }

    public void make() {
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
