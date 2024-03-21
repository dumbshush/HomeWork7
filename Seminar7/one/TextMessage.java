package Seminar7.one;

public class TextMessage implements Message{
    private String message;

    @Override
    public void sendMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
