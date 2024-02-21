package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_81_Constructors_Part_2;

public class Main {
    public static void main(String[] args) {

//        Account marcoAccount = new Account("4564654",1000.0,"Marco T","jjòjòlj@dfsdf.it","4324234234");
            Account marcoAccount = new Account();

//        primo.setAccountNumber("456465");
//        primo.setBalance(1010.0);
//        primo.setCustomerName("Pippo");
//        primo.setEmail("fdasdasdsa@jlk.it");
//        primo.setPhoneNumber("1231546");
//
//
        System.out.println(marcoAccount.getAccountNumber());
        System.out.println(marcoAccount.getBalance());

        marcoAccount.withdrawing(100.0);
        marcoAccount.depositing(250);
        marcoAccount.withdrawing(50);
        marcoAccount.withdrawing(200);

        System.out.println("\nFinal Balance= "+marcoAccount.getBalance());
        Account timsAccount = new Account("Tim","ffsdf@fsdf.it","12312313");
        System.out.println("AccountNo: "+timsAccount.getAccountNumber()+
                "; name "+timsAccount.getCustomerName());


    }
}
