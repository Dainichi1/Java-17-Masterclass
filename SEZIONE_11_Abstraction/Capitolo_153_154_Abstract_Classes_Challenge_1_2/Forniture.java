package SEZIONE_11_Abstraction.Capitolo_153_154_Abstract_Classes_Challenge_1_2;

public class Forniture extends ProductForSale{

    public Forniture(String type, double price, String description) {
        super(type, price,description);
    }

    @Override
    public void showDetails() {

        System.out.println("This "+type+" was manufactured in Italy");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
