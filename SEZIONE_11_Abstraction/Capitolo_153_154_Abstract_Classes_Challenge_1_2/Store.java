package SEZIONE_11_Abstraction.Capitolo_153_154_Abstract_Classes_Challenge_1_2;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Paintings", 1350,
                "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Impressionistic work by ABF painted in 2012"));

        storeProducts.add(new Forniture("Desk", 500,"Mahogany Desk"));
        storeProducts.add(new Forniture("Lamp",200,"Tiffany"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3,5);
        addItemToOrder(order2, 0,1);
        addItemToOrder(order2, 2,1);
        printOrder(order2);

    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder (ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
