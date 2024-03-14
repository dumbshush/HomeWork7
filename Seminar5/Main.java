/*
 * Задача 1 - Data/model
� Создать package – model. Работу продолжаем в нем
� Реализовать абстрактный класс User и его наследники Student и Teacher.
Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
наследники собственные параметры (какие, по вашему выбору – Пример:
studentId для Student, teacherId для Teacher)
 */

package Seminar5;


import Seminar5.controller.OnlineStoreController;
import Seminar5.model.Shwarma;
import Seminar5.view.StoreView;

public class Main {
    public static void main(String[] args) {
        OnlineStoreController onlineStoreController = new OnlineStoreController();
        onlineStoreController.addOrder(new Shwarma(200, "мясо"));
        StoreView storeView = new StoreView(onlineStoreController);
        System.out.println("///");
        storeView.showOrders();
        System.out.println();
    }
}
