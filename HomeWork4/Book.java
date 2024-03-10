package HomeWork4;

public class Book <T> {
    private T name;
    private int pages;
    private T writer;

    public Book(T name, int pages, T writer){
        this.name = name;
        this.pages = pages;
        this.writer = writer;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public T getWriter() {
        return writer;
    }

    public void setWriter(T writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Книга{" + "name= '" + name + '\'' + ", pages= " + pages + ", writer= '" + writer + '\'' + '}';
    }
}
