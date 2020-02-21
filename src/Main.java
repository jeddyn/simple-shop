import model.Basket;
import model.Product;
import service.ShoppingBasketService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product Product1 = new Product("ser", "ser", 50,true, "aSER20" );
        Product Product2 = new Product("Woda", "Niegazowana", 5.0, false, "aWODA20");
        Product Product3 = new Product("Kawa", "Niegazowana", 5.0, false, "aKAWA20");

        List<Product> listofProducts = new ArrayList<>();
        listofProducts.add(Product1);
        listofProducts.add(Product2);
        listofProducts.add(Product3);

        Basket basket = new Basket (listofProducts);
        ShoppingBasketService service = new ShoppingBasketService();
        System.out.println(service.totalprice(basket));

    }
}
