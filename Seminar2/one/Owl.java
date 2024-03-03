package Seminar2.one;

public class Owl extends Animal implements Feeding{
    @Override
    public void voice() {
        System.out.println("uhu");
    }

    @Override
    public void feed() {
        System.out.println("catching mouse");
    }
}
