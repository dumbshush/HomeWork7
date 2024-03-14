package Seminar5.service;

import Seminar5.model.Orders;
import Seminar5.model.Shwarma;

public class StoreService {
    Orders orders = new Orders();
       public void addOrder(Shwarma shwarma){ // метод позволит разместить одну шаву в список заказов
        if (shwarma.getContains() == null | shwarma.getCost() <= 0) {
            
            System.out.println("неправильное имя");
        }else{
            orders.add(shwarma);
            System.out.println("добавили в онлайн стор " + shwarma);
        }
        
    }

    public void seeOrders(){
        orders.getArrayList();
    }
}
