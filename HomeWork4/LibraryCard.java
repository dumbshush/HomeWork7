package HomeWork4;

public class LibraryCard <K, V>{

    private K number;
    private V bookInformation;

    public LibraryCard (K number){
        this.number = number;
    }

    public V getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(V bookInformation) {
        this.bookInformation = bookInformation;
    }

    @Override
    public String toString() {
        return "Карточка{" + "Номер: " + number + ", book information= " + bookInformation + '}';
    }

}
