package SEZIONE_11_Generics.Capitolo_173_Static_methods_and_multiple_upper_bounds;



public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0,100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted((super.toString()), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
