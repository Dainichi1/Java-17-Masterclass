package SEZIONE_06.Capitolo_70_Parsing_Values_and_Reading_Inpit;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2022;
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth); // prende una stringa e ritorna un int
        System.out.println("Age = " + (currentYear - dateOfBirth));

        String userAgeWithPartialYear = "23.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

    }
}
