/*
 * Вам нужно разработать декоратор для добавления дополнительной информации к текстовому сообщению.

Создайте интерфейс Message, который определяет методы для отправки и получения текстового сообщения.

Реализуйте класс TextMessage, представляющий базовое текстовое сообщение.

Создайте декоратор MessageDecorator, который будет добавлять дополнительную информацию к текстовому сообщению (например, дату отправки).

Напишите клиентский код, который будет использовать декоратор для отправки и получения текстовых сообщений с дополнительной информацией.
 */

package Seminar7.one;

public class Main {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage();

        textMessage.setMessage("Hiii qwq");

        MessageDecorator messageDecorator = new MessageDecorator(textMessage);

        textMessage.sendMessage();;
        messageDecorator.sendMessage();
    }
}
