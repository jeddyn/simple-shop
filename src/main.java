import  model.Product
import model.ShoppingBasket;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Product product1 = new Product("ser","żółty", 50.00, "tak" , "a32143sd" );
        Product product2 = new Product("wódka ", "25,00", "nie" , "sadasf221");
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);





        ShoppingBasket shoppingBasket = new ShoppingBasket();

    }



}
