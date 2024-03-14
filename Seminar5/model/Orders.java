package Seminar5.model;

import java.util.ArrayList;

public class Orders {
    public ArrayList<Shwarma> arrayList;

    public Orders(){
        this.arrayList = new ArrayList<>();
    }

    public void add(Shwarma shwarma){
        System.out.println("добавили в ордерс " + shwarma);
        arrayList.add(shwarma);
    } 
    public void getArrayList() {
        System.out.println(arrayList);
    }
    @Override
    public String toString() {
        return "Orders{" + "arrayList= " + arrayList + '}';
    }
}
