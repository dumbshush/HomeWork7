package Seminar2.one;
public class Cat extends Animal implements Feeding {
    @Override
    public void voice() {
        System.out.println("mew");
    }

    @Override
    public void feed() {
        System.out.println("feeding fish");
    }
}
