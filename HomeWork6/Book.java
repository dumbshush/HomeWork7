/* Single responsibility principle:
 * Класс Book отвечает только за представление книги и хранение её данных. 
 * 
 * Open-closed principle:
 * Класс Book открыт для расширения новыми типами журналов, 
 * так как он может быть расширен путем реализации соответствующего интерфейса BookItem
 * 
 * Liskov Substitution principle требует возможностииспользования
 * любых порожденных классов на месте родительских.
 * Класс Book корректно реализует методы интерфейса BookItem, не изменяя его контракты. 
 * Объекты этого класса могут быть использованы везде, 
 * где ожидается объекты соответствующего интерфейса, не нарушая ожидаемого поведения.
 * 
 * 
 */

package HomeWork6;

public class Book implements BookItem {
    private String name;
    private int pages;
    private String author;
    private String bookID;
    private int year;

    public Book(String name, int pages, String author, String bookID, int year) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.bookID = bookID;
        this.year = year;
    }

    @Override
    public int pages() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", pages=" + pages + ", author=" + author + ", bookID=" + bookID + ", year="
                + year + "]";
    }
    
    
}
