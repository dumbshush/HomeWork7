package Seminar4.one;
public class Hamster {
    private String name;

    public Hamster(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}
