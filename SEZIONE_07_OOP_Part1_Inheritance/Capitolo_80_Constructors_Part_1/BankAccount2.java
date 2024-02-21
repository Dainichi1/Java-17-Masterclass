package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_80_Constructors_Part_1;

public class BankAccount2 {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount2() {
        System.out.println("Empty constructor called");
    }

    public BankAccount2(String accountNumber, double balance, String customerName, String email,
                        String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
            System.out.println("Fondi insufficienti.");
        } else {

            balance -= amount;
            System.out.println("Prelievo di: " + amount + " euro eseguito. nuovo salso: " + balance);
        }
    }
}
