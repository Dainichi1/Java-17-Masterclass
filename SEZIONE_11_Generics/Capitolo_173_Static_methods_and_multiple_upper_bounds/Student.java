package SEZIONE_11_Generics.Capitolo_173_Static_methods_and_multiple_upper_bounds;

import java.util.Random;

public class Student implements QueryItem{

    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann","Bill","Cathy","John","Tim"};
    private static String[] courses = {"C++","Java","Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65,91); // 65 = A 91 = Z
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);

    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fname = fieldName.toUpperCase();
        return switch (fname) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;

        };
    }
}
