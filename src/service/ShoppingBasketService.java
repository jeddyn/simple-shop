package service;

import model.Product;
import model.ShoppingBasket;

import java.util.List;

public class ShoppingBasketService {

    public double totalPrice( ShoppingBasket shoppingBasket ) {
        List<Product> listOfProducts = shoppingBasket.getListOfProducts();
        double totalPrice = 0;

        for (int i = 0; i < listOfProducts.size(); i++) {
            totalPrice += listOfProducts.get(i).getPrice();
        }
        return totalPrice;
    }

    public void printAllProductsName(ShoppingBasket shoppingBasket){
        List<Product> listOfProducts = shoppingBasket.getListOfProducts();
        for (int i = 0; i < listOfProducts.size(); i++){
            System.out.println(listOfProducts.get(i).getName());
        }
    }
}
