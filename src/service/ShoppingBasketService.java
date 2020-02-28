package service;

import model.Product;
import model.ShoppingBasket;

import java.util.List;

public class ShoppingBasketService {


    public double totalPrice(ShoppingBasket shoppingBasket) {
        List<Product> listOfProduct = shoppingBasket.getListaProduktów();
        double totalPrice = 0;
        for (int i = 0; i < listOfProduct.size(); i++) {
            totalPrice += listOfProduct.get(i).getCena();
        }
        return totalPrice;
    }


    public void printProducts(ShoppingBasket shoppingBasket) {
        List<Product> listOfProduct = shoppingBasket.getListaProduktów();

        for (int i = 0; i < listOfProduct.size(); i++) {

            System.out.println(listOfProduct.get(i).getNazwa());

        }


    }
}

