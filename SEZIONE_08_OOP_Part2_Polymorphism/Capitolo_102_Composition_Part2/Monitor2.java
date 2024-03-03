package SEZIONE_08_OOP_Part2_Polymorphism.Capitolo_102_Composition_Part2;

public class Monitor2 extends Product2 {

    private int size;
    private String resolution;

    public Monitor2(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor2(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelArt (int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s ", x, y, color
        ));
    }
}
