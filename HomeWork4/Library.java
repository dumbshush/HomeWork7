package HomeWork4;

import java.util.ArrayList;


public class Library <T, K, V> {

    private ArrayList<Book<T>> books;
    private ArrayList<LibraryCard<K, V>> cards;
    private int booksCounter;
    private int cardsCounter;

    public Library(){
        books = new ArrayList<>();
        cards = new ArrayList<>();
        booksCounter = 0;
    }

    void addBook(Book<T> book){
        books.add(book);
        booksCounter++;
    }

    void createCard (LibraryCard<K, V> card){
        cards.add(card);
        cardsCounter ++;
    }

    @Override
    public String toString() {
        return "Кол-во выданных книг= " + booksCounter + ", выданные книги: " + books +  
        ",\n" + "\n" +  "Кол-во выданных карточек= " + cardsCounter + ", выданные карточки: " + cards;
    }
}
