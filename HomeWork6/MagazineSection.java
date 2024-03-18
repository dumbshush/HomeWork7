/*
 * Single responsibility principle:
 * MagazineSection ответственен только за управление коллекцией журналов.
 * 
 * Open-closed principle гласит, что что классы должны
 * быть открыты для расширения и закрыты для модификации.
 * Класс MagazineSection открыт для расширения новыми функциональностями, например, 
 * добавлением методов для поиска или сортировки журналов.
 * 
 * Dependency inversion principle гласит, что модуль высокого уровня
 * не должен зависеть от модулей низкого уровня.
 * Классы BookSection и MagazineSection зависят от абстракций BookItem и MagazineItem, 
 * что соответствует принципу инверсии зависимостей.
 */

package HomeWork6;

import java.util.ArrayList;

public class MagazineSection {
    private ArrayList<MagazineItem> magazines;
    private int magazineCount;

    public MagazineSection(){
        magazines = new ArrayList<>();
        magazineCount = 0;
    }

    void addMagazine(MagazineItem magazine){ // добавляет журналов в библиотеку
        magazines.add(magazine);
        magazineCount++;
    }

    public ArrayList<MagazineItem> getMagazines() {
        return magazines;
    }

    @Override
    public String toString() {
        return "Кол-во журналов: " + magazineCount + ", Журналы: " + magazines;
    }
}
