package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_31_Person;

public class Main {
    public static void main(String[] args) {


        Person persona = new Person();

        persona.setFirstName("Marco");
        persona.setLastName("Torquati");
        persona.setAge(44);
        System.out.println("IL mio nome è: "+persona.getFirstName());
        System.out.println("Il mio cognome è: "+persona.getLastName());
        System.out.println("Ho "+persona.getAge()+" anni");
        System.out.println("Sono un teenager = "+persona.isTeen());
        System.out.println("Il mio nome completo è: "+persona.getFullName());
    }
}
