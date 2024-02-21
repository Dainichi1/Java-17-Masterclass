package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_80_Constructors_Part_1;

public class Main {
    public static void main(String[] args) {

        BankAccount2 account = new BankAccount2("4564654",1000.0,"Marco T","jjòjòlj@dfsdf.it","4324234234");

//        primo.setAccountNumber("456465");
//        primo.setBalance(1010.0);
//        primo.setCustomerName("Pippo");
//        primo.setEmail("fdasdasdsa@jlk.it");
//        primo.setPhoneNumber("1231546");
//
//
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        account.withdrawing(100.0);
        account.depositing(250);
        account.withdrawing(50);
        account.withdrawing(200);

        System.out.println("\nFinal Balance= "+account.getBalance());


    }
}
