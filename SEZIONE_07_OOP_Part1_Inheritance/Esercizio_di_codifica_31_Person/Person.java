package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_31_Person;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String  getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        return (age > 12) && (age < 20);
    }

    public String getFullName () {
        if ((Objects.equals(firstName, ""))&&(Objects.equals(lastName, ""))) {
            return "";
        }
        if (Objects.equals(lastName, "")) {
            return firstName;
        }
        if (Objects.equals(firstName, "")) {
            return lastName;
        }
        return firstName+" "+lastName;
    }
}
