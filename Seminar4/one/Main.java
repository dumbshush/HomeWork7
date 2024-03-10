package Seminar4.one;
/*
 * Задача: Напишите обобщенный класс VetClinic, который представляет собой ветеринарную клинику для различных видов животных. 
 * Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов. 
 * Продемонстрируйте использование этого класса для работы с пациентами - собаками, кошками и другими животными.
 */

public class Main {
    public static void main(String[] args) {
        VetClinic<GuineaPig> vetClinic1 = new VetClinic<>();
        VetClinic<Hamster> vetClinic2 = new VetClinic<>();

        GuineaPig guineaPig1 = new GuineaPig("Ketchup");
        GuineaPig guineaPig2 = new GuineaPig("Mustard");

        Hamster hamster1 = new Hamster("Rino");
        Hamster hamster2 = new Hamster("Pipa");

        vetClinic1.add(guineaPig1);
        vetClinic1.add(guineaPig2);
        vetClinic2.add(hamster1);
        vetClinic2.add(hamster2);

        vetClinic1.help(guineaPig1);
        vetClinic2.help(hamster1);
    }
}
