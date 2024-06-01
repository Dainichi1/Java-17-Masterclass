package SEZIONE_11_Generics.Capitolo_167_168_Generic_Class_Challenge;

public class Main {

    public static void main(String[] args) {

        var nationalUSPArks = new Park[]{
                new Park("Yellowstone", "44.4882,-110.5916"),
                new Park("Grand Canyon", "37.8855, -119.5360"),
                new Park("Yosemite", "336.1085,-119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSPArks);
        parkLayer.renderLayer();

        var majorUSRiver = new River[]{
                new River("Mississippi","247.2160,-95.2348","29.1566,-89.2495","35.1556,-90.0659"),
                new River("Missouri","247.423,-95.4234","29.1566,-32.2495","35.1556,-90.0659")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRiver);

        riverLayer.addElements(new River("Colorado","247.2160,-95.2348","29.1566,-89.2495","35.1556,-90.0659"));

        riverLayer.renderLayer();

    }
}
