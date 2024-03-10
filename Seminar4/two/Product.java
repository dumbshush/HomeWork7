package Seminar4.two;

public class Product<T> { // name prod
    private T name;
    private Double coast;

    private Product(T name, Double coast){
        this.name = name;
        this.coast = coast;
    }

    public T getName() {
        return name;
    }

    public Double getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return "Продукт{" + "name= " + name + " coast= " + coast + '}';
    }
}
