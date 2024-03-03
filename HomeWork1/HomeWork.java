/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный 
метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */

package HomeWork1;

import java.util.ArrayList;

public class HomeWork {

    // static HotDrink drink = new HotDrink();

    public static void main(String[] args) {

        ArrayList<HotDrink> drink = new ArrayList<>();
        drink.add(new Drink("Tea", 16, 150));
        drink.add(new Drink("Cocoa", 20, 138));
        drink.add(new Drink("Hot chocolate", 12, 143));

        VenMach vendingMachine = new VenMach();
        vendingMachine.initProducts(drink);
        System.out.println(vendingMachine.getProduct("Cocoa"));

        Coffee coffee = new Coffee("Coffee", 8, 160);
        
        // coffee.setTemperature(136);
        //System.out.println(drink);

        
    }
}
