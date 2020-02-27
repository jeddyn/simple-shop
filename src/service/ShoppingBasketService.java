package service;

import model.Product;
import model.ShoppingBasket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasketService {
    public double totalPrice(ShoppingBasketService shoppingBasket) {
        return 0.0;
    }

    public double jakasnazwa() {

        List<Product> listaProduktów = new ArrayList<>();

        double suma = 0;

        for (int i = 0; i < listaProduktów.size(); i++) {
            suma += listaProduktów.get(i).getCena();
        }

        return suma;
    }

    public void nazwyProduktów(ShoppingBasket shoppingBasket) {
        List<Product> listaProduktów = new ArrayList<>();

        for (int j = 0; j < listaProduktów.size(); j++) {

            System.out.println(listaProduktów.get(j));
        }
    }
}
