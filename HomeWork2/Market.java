/*
 * Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, метод update 
– обновляет состояние магазина (принимает и отдаёт заказы)
 */

package HomeWork2;
import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    private ArrayList<Human> queue = new ArrayList<>();
    private ArrayList<Human> customers = new ArrayList<>();

    @Override
    public void takeInQueue(Human human) {
        queue.add(human);
    }

    @Override
    public void takeOrders() {
        for (Human human : queue) {
            human.setMakeOrder();
        }
    }

    @Override
    public void giveOrders() {
        for (Human human : queue) {
            human.setTakeOrder();
        }
    }

    @Override
    public void releaseFromQueue() {
        if (!queue.isEmpty()) {
            Human removedHuman = queue.remove(0);
            System.out.println("Ушли из очереди: " + removedHuman.getName());
        }
    }

    @Override
    public void acceptToMarket(Human human) {
        customers.add(human);
        System.out.println("Пришли в магазин: " + human.getName());
    }

    @Override
    public void releaseFromMarket(List<Human> humans) {
        customers.removeAll(humans);
        for (Human human : humans) {
            System.out.println("Ушли из магазина: " + human.getName());
        }
    }

    @Override
    public void update() {
        System.out.println("Статус магазина: ");
        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Количество клиентов: " + customers.size());
    }
}
