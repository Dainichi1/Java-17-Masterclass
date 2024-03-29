package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_93_Inheritance_Challenge_Part2;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker () {

    }


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6)); // 09-12-1979 con substrin (6) elimina i primi 6 caratteri (09-12-)

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate (String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
