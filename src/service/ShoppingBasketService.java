package service;

import model.Product;
import model.ShoppingBasket;

import java.util.List;

public class ShoppingBasketService {


    public double totalPrice(ShoppingBasket shoppingBasket) {
        double sumaCenProduktow = 0;
        List<Product> listaProduktow = shoppingBasket.getListaProduktów();

        for (int i = 0; i < listaProduktow.size(); i++) {
            sumaCenProduktow += listaProduktow.get(i).getCena();
        }
        return sumaCenProduktow;
    }

    public void wyswietlNazwyProduktow(ShoppingBasket shoppingBasket){
        List<Product> listaProduktow = shoppingBasket.getListaProduktów();
        for (int i = 0; i < listaProduktow.size(); i++) {
            System.out.println(listaProduktow.get(i));
        }
    }
}
