package SEZIONE_11_Abstraction.Capitolo_153_154_Abstract_Classes_Challenge_1_2;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price,String description) {
        super(type, price,description);
    }

    @Override
    public void showDetails() {

        System.out.println("This "+type+" is a beautiful reproduction");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
