import model.Product;
import model.ShoppingBasket;
import service.ShoppingBasketService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product produckt1 = new Product("ser","ser", 49.99 , true, "asa");
        Product produckt2 = new Product("woda","woda", 2.99 , true, "asa2");
        Product produckt3 = new Product("kawa","Skawa", 4.99 , true, "as4a");
        List<Product> listOfProduckts = new ArrayList<>();
        listOfProduckts.add(produckt1);
        listOfProduckts.add(produckt2);
        listOfProduckts.add(produckt3);

        ShoppingBasket shoppingBasket = new ShoppingBasket(listOfProduckts);
        ShoppingBasketService service= new ShoppingBasketService();
        System.out.println(service.totalPrice(shoppingBasket));

    }
}