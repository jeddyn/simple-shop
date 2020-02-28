package service;

import model.Product;
import model.ShoppingBasket;

import java.util.List;

public class ShoppingBasketService {


    public double totalPrice(ShoppingBasket shoppingBasket) {
        List<Product> listOfProducts = shoppingBasket.getListaProduktów();
        double totalPrice = 0;

        for (int i = 0; i < listOfProducts.size(); i++) {


            totalPrice += listOfProducts.get(i).getCena();

        }
        return totalPrice;
    }

    public void printAllProductsName(ShoppingBasket shoppingBasket) {
        List<Product> listOfProducts = shoppingBasket.getListaProduktów();
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(listOfProducts.get(i).getNazwa());
        }

            
    }

}






