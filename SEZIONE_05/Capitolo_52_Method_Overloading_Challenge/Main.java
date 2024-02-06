package SEZIONE_05.Capitolo_52_Method_Overloading_Challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("La conversione è: "+convertToCentimeters(55)+" cm.");
        System.out.println("La seconda conversione è: "+convertToCentimeters(6,0)+" cm.");
    }

    public static double convertToCentimeters (int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters (int foot, int inches) {
        int footToInches = foot * 12;
        int total = footToInches + inches;
        return convertToCentimeters(total);
    }
}
