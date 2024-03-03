package one;


public class Cat {
    private String name;
    private int age;

    public void purr(){
        System.out.println("*purring*");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("Black")) {
            System.out.println("bad name!");
        }else{
            this.name = name;
        }
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
