package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_79_Classes_Challenge_Exercise;

public class Main {
    public static void main(String[] args) {

        BankAccount primo = new BankAccount();

        primo.setAccountNumber("12345");
        primo.setBalance(1000.0);
        primo.setCustomerName("Marco");
        primo.setEmail("fdasdasdsa@dsfsdfs.it");
        primo.setPhoneNumber("13246546");


        System.out.println("\nAccount number: "+primo.getAccountNumber()+
                ", \nBalance: "+primo.getBalance()+
                ", \nCustomer Name: "+primo.getCustomerName()+
                ", \nE-mail: "+primo.getEmail()+
                ", \nTelephone number: "+primo.getPhoneNumber()+"\n");

        primo.withdrawing(100.0);
        primo.depositing(250);
        primo.withdrawing(50);
        primo.withdrawing(200);

        System.out.println("\nFinal Balance: "+primo.getBalance());


    }


}
