package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_82_Constructor_Challenge_Exercise;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public Customer (String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer () {
        this("Giovanni",1750.0,"ffsdfsd@fdsadf.it");
        System.out.println("chiamto costruttore vuoto");
    }

    public Customer (String name, String emailAddress) {
        this(name,1400.0,emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
