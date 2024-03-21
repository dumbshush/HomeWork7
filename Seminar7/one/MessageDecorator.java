package Seminar7.one;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDecorator implements Message{
    Message mess;

    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatterDateTime = time.format(formatter);

    public MessageDecorator(Message mess) {
        this.mess = mess;
    }

    @Override
    public void sendMessage() {
        mess.sendMessage();
        System.out.println(formatterDateTime);
    }

}
