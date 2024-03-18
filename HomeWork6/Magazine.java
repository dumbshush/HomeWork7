/* Single responsibility principle:
 * Magazine отвечает только за представление журнала и хранение его данных
 * 
 * Open-closed principle:
 * Класс Magazine открыт для расширения новыми типами журналов, 
 * так как он может быть расширен путем реализации соответствующего интерфейса MagazineItem
 * 
 * Liskov Substitution principle требует возможностииспользования
 * любых порожденных классов на месте родительских.
 * Класс Magazine корректно реализует методы интерфейса MagazineItem, не изменяя его контракты. 
 * Объекты этого класса могут быть использованы везде, 
 * где ожидается объекты соответствующего интерфейса, не нарушая ожидаемого поведения.
 */

package HomeWork6;

public class Magazine implements MagazineItem{

    private String name;
    private int pages;
    private String publishingHouse;
    private int magazineID;
    private int circulation;

    public Magazine(String name, int pages, String publishingHouse, int magazineID, int circulation) {
        this.name = name;
        this.pages = pages;
        this.publishingHouse = publishingHouse;
        this.magazineID = magazineID;
        this.circulation = circulation;
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

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getMagazineID() {
        return magazineID;
    }

    public void setMagazineID(int magazineID) {
        this.magazineID = magazineID;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    @Override
    public String toString() {
        return "Magazine [name=" + name + ", pages=" + pages + ", publishingHouse=" + publishingHouse + ", magazineID="
                + magazineID + ", circulation=" + circulation + "]";
    }

    
}
