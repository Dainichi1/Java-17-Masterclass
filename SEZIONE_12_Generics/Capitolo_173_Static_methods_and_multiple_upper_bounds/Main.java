package SEZIONE_12_Generics.Capitolo_173_Static_methods_and_multiple_upper_bounds;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int studentCount = 10;
        List<Student>  students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
//        printList(students);
        printMoreList(students);

        List<LPAStudent>  lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
//        printList(lpaStudents);
        printMoreList(lpaStudents);

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("COURSE","Python");
        printMoreList(matches);

        var students2021 = QueryList.getMatches(students, "YearStarted","2021");
        printMoreList(students);
    }

    public static  void printMoreList (List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": "+student);
        }
        System.out.println();
    }

//    public static <T extends Student> void printList (List<T> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": "+student);
//        }
//        System.out.println();
//    }
}
