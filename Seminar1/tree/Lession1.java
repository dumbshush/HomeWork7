/*
Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
* */
package tree;

import java.util.ArrayList;

abstract class Product {

private String name;
private double cost;

public Product(String name, double cost) {
this.name = name;
this.cost = cost;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getCost() {
return cost;
}

public void setCost(double cost) {
this.cost = cost;
}

@Override
public String toString() {
return "Product{" +
"name='" + name + '\'' +
", cost=" + cost +
'}';
}
}

interface VendingMachine {

Product getProduct(String name);

}

class BattleOfWater extends Product {
String name;
double cost;

public BattleOfWater(String name, double cost) {
super(name, cost);
}

}

class VenMach implements VendingMachine {
private ArrayList<Product> battleOfWaters;

public void initProducts(ArrayList<Product> battleOfWaters) {
this.battleOfWaters = battleOfWaters;
}

@Override
public Product getProduct(String prodName) {
for (Product p : battleOfWaters) {
if (p.getName().equals(prodName)) {
return p;
}
}
return null;
}

}

public class Lession1 {
public static void main(String[] args) {
ArrayList<Product> prods = new ArrayList<>();
prods.add(new BattleOfWater("Вода", 40.0));
prods.add(new BattleOfWater("Минералка", 60.0));
prods.add(new BattleOfWater("Кола", 80.0));

VenMach vendingMachine = new VenMach();
vendingMachine.initProducts(prods);
System.out.println(vendingMachine.getProduct("Кола"));
}
}