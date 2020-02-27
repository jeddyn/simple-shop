import model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listaProduktów = new ArrayList<>();
        double sumaCenProduktow = 0;

        for (int i = 0; i < listaProduktów.size(); i++) {
            sumaCenProduktow+=listaProduktów.get(i).getCena();
        }
    }
}
