/*
 * Single responsibility principle:
 * BookSection отвечает только за хранение и управление коллекцией книг.
 * 
 * Open-closed principle гласит, что что классы должны
 * быть открыты для расширения и закрыты для модификации.
 * Класс BookSection открыт для расширения новыми функциональностями, например, 
 * добавлением методов для поиска или сортировки книг.
 * 
 * Dependency inversion principle гласит, что модуль высокого уровня
 * не должен зависеть от модулей низкого уровня.
 * Классы BookSection и MagazineSection зависят от абстракций BookItem и MagazineItem, 
 * что соответствует принципу инверсии зависимостей.
 * 
 */

package HomeWork6;

import java.util.ArrayList;


public class BookSection{

    private ArrayList<BookItem> books;
    private int bookCount;

    public BookSection(){
        books = new ArrayList<>();
        bookCount = 0;
    }

    void addBooks(BookItem book){ // добавляет книги в библиотеку
        books.add(book);
        bookCount++;
    }

    public ArrayList<BookItem> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Кол-во книг: " + bookCount + ", Книги: " + books;
    }
}

