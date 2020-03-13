import model.Product;
import model.ShoppingBasket;
import service.ShoppingBasketService;
import service.CreditCardService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //String nazwa, String opis, double cena, Boolean czyTrzebaWazyc, String kodKreskowy
        Product product1 =
                new Product("Ser", "Ser",
                        4.99, true, "aSER20");

        Product product2 =
                new Product("Woda", "Niegazowana",
                        4.20, false, "aWODA20");

        Product product3 =
                new Product("Kawa", "Ziarna",
                        12.50, false, "aKAWA20");

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);

        ShoppingBasket shoppingBasket = new ShoppingBasket(listOfProducts);

        ShoppingBasketService service = new ShoppingBasketService();
        System.out.println(service.totalPrice(shoppingBasket));
        service.printAllProductsName(shoppingBasket);
        System.out.println(service.discount(shoppingBasket, 10));
CreditCardService creditCardService = new CreditCardService();

    }
}
