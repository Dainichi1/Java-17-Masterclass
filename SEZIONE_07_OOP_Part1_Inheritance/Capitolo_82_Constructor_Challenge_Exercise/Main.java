package SEZIONE_07_OOP_Part1_Inheritance.Capitolo_82_Constructor_Challenge_Exercise;

public class Main {
    public static void main(String[] args) {
        Customer primoCustomer = new Customer("Marco",1500.0,"fsdfsd@fdsfs.it");
        System.out.println("Primo cliente: "+primoCustomer.getName()+"; limite di spesa: "+primoCustomer.getCreditLimit()+"; email: "+primoCustomer.getEmailAddress()+"\n");

        Customer secondoCustomer = new Customer();
        System.out.println("limite di spesa con costruttore vuoto: "+secondoCustomer.getCreditLimit());
        System.out.println("nome del cliente con costruttore vuoto: "+secondoCustomer.getName());
        System.out.println("email del cliente con costruttore vuoto: "+secondoCustomer.getEmailAddress()+"\n");

        Customer terzoCustomer = new Customer("Giovanni","sdasdasd@sdsa.gov");
        System.out.println("limite di spesa non specificato nel costruttore: "+terzoCustomer.getCreditLimit());
        System.out.println("nome del cliente inserito nel costruttore: "+terzoCustomer.getName());
        System.out.println("email inserita nel costruttore: "+terzoCustomer.getEmailAddress());

    }
}
