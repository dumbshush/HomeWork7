package one;
public class Seminar1 {
    static Cat cat = new Cat();
    public static void main(String[] args) {
        cat.setName("Bard");
        cat.setAge(5);


        System.out.println(cat);
        badMethod();
        RussianGreyCat russianGreyCat = new RussianGreyCat();
        russianGreyCat.purr();
        Animal.sayHello();

    }

    public static void badMethod(){
        cat.setName("Black");
        System.out.println(cat);
    }
}
