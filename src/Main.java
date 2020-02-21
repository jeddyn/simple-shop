import model.Product;
import model.ShoppingBasket;
import service.ShoppingBasketService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     //   String nazwa, String opis, Double cena, Boolean czyTrzebaWazyc, String kodKreskowy
        Product product1 = new Product("ser","ser",50.00,false,"aW4835");
        Product product2 = new Product("woda","niegazowana",5.0,false,"aW3523");
        Product product3 = new Product("Kawa","Ziarna",30.0,false,"aEr343");
        List<Product>listOfProtucts = new ArrayList<>();
        listOfProtucts.add(product1);
        listOfProtucts.add(product2);
        listOfProtucts.add(product3);




        ShoppingBasket shoppingBasket= new ShoppingBasket(listOfProtucts);
        ShoppingBasketService service = new ShoppingBasketService();
        System.out.println(service.totalPrice(shoppingBasket));
            }
}
