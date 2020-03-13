package service;

import model.Product;
import model.ShoppingBasket;

import java.util.List;

public class ShoppingBasketService {


    public double totalPrice(ShoppingBasket shoppingBasket) {
        List<Product> listOfProduct = shoppingBasket.getListOfProducts();
        double totalPrice = 0;
        for (int i = 0; i < listOfProduct.size(); i++) {
            totalPrice += listOfProduct.get(i).getPrice();
        }
        return totalPrice;
    }


    public void printProducts(ShoppingBasket shoppingBasket) {
        List<Product> listOfProduct = shoppingBasket.getListOfProducts();

        for (int i = 0; i < listOfProduct.size(); i++) {



            System.out.println(listOfProduct.get(i).getName());

        }


    }
    public void Rabat(ShoppingBasket shoppingBasket, double rabat) {


        double zwrot =totalPrice(shoppingBasket)*0.01*rabat;
        System.out.format("%.2f%n", zwrot);
        }


    }


