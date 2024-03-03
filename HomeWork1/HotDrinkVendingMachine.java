package HomeWork1;
import java.util.ArrayList;

interface HotDrinkVendingMachine {
    HotDrink getProduct(String name);
}

class Drink extends HotDrink {
    
    public Drink(String name, int volume, int temperature) {
    super(name, volume, temperature);
    }
}

class VenMach implements HotDrinkVendingMachine {

    private ArrayList<HotDrink> drinks;

    public void initProducts(ArrayList<HotDrink> drinks) {
        this.drinks = drinks;
        }

        @Override
        public HotDrink getProduct(String prodName) {
            for (HotDrink d : drinks) {
                if (d.getName().equals(prodName)) {
                    return d;
                }
            }
            return null;
        }
}
    