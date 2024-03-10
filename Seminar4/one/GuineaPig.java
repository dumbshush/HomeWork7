package Seminar4.one;
public class GuineaPig {
    private String name;

    public GuineaPig(String name){
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
