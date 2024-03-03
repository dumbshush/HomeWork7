package HomeWork1;

public class Coffee extends HotDrink {
    public Coffee(String name, int volume, int temperature) {
        super(name, volume, temperature); // вызов конструктора родительского класса
        if (temperature != 136) {
            System.out.println("HotDrink{name='Coffee', volume=8 ounces, temperature=136 degrees}");
        }
    }
}
