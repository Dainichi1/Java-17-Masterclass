package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_92_Inheritance_Challenge_Part1;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        Employee joe = new Employee("Joe","11/11/1990",
                "03/03/2020");
        System.out.println(joe);
    }
}
