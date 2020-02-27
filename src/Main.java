import model.Product;
import model.ShoppingBasket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listaProduktów = new ArrayList<>();

        double suma = 0;

        for (int i = 0; i < listaProduktów.size(); i++) {
            suma += listaProduktów.get(i).getCena();
        }
    }


}
