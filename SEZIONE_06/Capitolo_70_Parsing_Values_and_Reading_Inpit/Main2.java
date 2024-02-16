package SEZIONE_06.Capitolo_70_Parsing_Values_and_Reading_Inpit;

public class Main2 {

    public static void main(String[] args) {

        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));
    }


    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi "+name+", thanks for taking this course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+age+" years old!";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
