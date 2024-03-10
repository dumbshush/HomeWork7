/*
 * Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
 * Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. 
Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
Создайте класс Library, который будет представлять библиотеку. 
У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.

Формат сдачи: ссылка на гитхаб проект
 */

package HomeWork4;

public class Main {
    public static void main(String[] args) {

        Library<String, Integer, String> library = new Library<>();
        library.addBook(new Book<String>("Needy Girl Overdose", 120, "Итару Бонноки"));
        library.addBook(new Book<String>("Ворону не к лицу кимоно", 381, "Тисато Абэ"));
        library.addBook(new Book<String>("Ворон хозяина не выбирает", 349, "Тисато Абэ"));

        LibraryCard<Integer, String> card1 = new LibraryCard<Integer,String>(1);
        LibraryCard<Integer, String> card2 = new LibraryCard<Integer,String>(2);
        LibraryCard<Integer, String> card3 = new LibraryCard<Integer,String>(3);

        card1.setBookInformation("Манга Needy Girl Overdose");
        card2.setBookInformation("Фентези Ворону не к лицу кимоно");
        card3.setBookInformation("Роман Ворон хозяина не выбирает");

        library.createCard(card1);
        library.createCard(card2);
        library.createCard(card3);

        System.out.println(library);
    }
}
