package HomeWork2;

public abstract class Human implements HumanBehavior {
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    public Human(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    public abstract String getName();

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
