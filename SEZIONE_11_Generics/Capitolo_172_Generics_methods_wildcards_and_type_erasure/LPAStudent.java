package SEZIONE_11_Generics.Capitolo_172_Generics_methods_wildcards_and_type_erasure;


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
