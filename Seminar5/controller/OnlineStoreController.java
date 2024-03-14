package Seminar5.controller;

import java.util.ArrayList;

import Seminar5.model.Orders;
import Seminar5.model.Shwarma;
import Seminar5.service.StoreService;

public class OnlineStoreController {
    private StoreService storeService = new StoreService();

    public OnlineStoreController(){
    }

    public void addOrder(Shwarma shwarma){ // метод позволит разместить одну шаву в список заказов
        storeService.addOrder(shwarma);
    }

    public void seeOrders(){
        storeService.seeOrders();
    }
}
