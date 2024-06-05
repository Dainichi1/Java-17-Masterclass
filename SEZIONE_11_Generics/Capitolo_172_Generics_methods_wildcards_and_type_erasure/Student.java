package SEZIONE_11_Generics.Capitolo_172_Generics_methods_wildcards_and_type_erasure;

import java.util.Random;

public class Student {

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
}
