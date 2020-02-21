package service;

import model.Basket;
import model.Product;

import java.util.List;

public class ShoppingBasketService {
    public double totalprice(Basket shoppingBasketService) {
        List<Product> listOfProducts = shoppingBasketService.getListaProduktów();
        double totalprice = 0;
        for (int i = 0; i < listOfProducts.size(); i++) {
            totalprice += listOfProducts.get(i).getCena();
        }


        return totalprice;
    }
}
