/*
 * Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
 */

package HomeWork6;

public class Main {
    public static void main(String[] args) {

        BookSection bookSection = new BookSection();
        bookSection.addBooks(new Book("Needy Girl Overdose", 120, "Итару Бонноки", "321AD", 2023));
        bookSection.addBooks(new Book("Ворону не к лицу кимоно", 381, "Тисато Абэ", "378AQ", 2020));
        bookSection.addBooks(new Book("Ворон хозяина не выбирает", 349, "Тисато Абэ", "928JS", 2022));

        MagazineSection magazineSection = new MagazineSection();
        magazineSection.addMagazine(
            new Magazine("В Мире Животных", 23, "ОООПитерскаяМука", 5494, 9094));
        magazineSection.addMagazine(
            new Magazine("Статья о камушках", 89, "Русская Правда(нет)", 655, 9094));
        magazineSection.addMagazine(
            new Magazine("Газета ЯХочуСпать", 102, "Телеканал ЯХочуЕсть", 1, 9094));
        
        System.out.println("Книжечки: ");
        System.out.println(bookSection);
        // for (BookItem book : bookSection.getBooks()) {
        //     System.out.println(book);
        // }

        System.out.println("\nЖурнальчики:");
        System.out.println(magazineSection);
        // for (MagazineItem magazine : magazineSection.getMagazines()) {
        //     System.out.println(magazine);
        // }
    }
}
