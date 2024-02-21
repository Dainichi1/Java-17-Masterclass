package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_81_Constructors_Part_2;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("465464",2.50,"Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String email,
                        String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String phoneNumber, String email) {
        this("99999",100.55,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositing (double amount) {
        balance +=amount;
        System.out.println("deposito di: "+amount+" euro eseguito. Nuovo saldo: "+balance);
    }

    public void withdrawing (double amount) {
        if (balance - amount < 0) {
            System.out.println("Fondi insufficienti. Hai solo: "+balance+" euro sul tuo conto.");
        } else {

            balance -= amount;
            System.out.println("Prelievo di: " + amount + " euro eseguito. nuovo salso: " + balance);
        }
    }
}
