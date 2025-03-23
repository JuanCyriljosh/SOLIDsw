package three;

public class SimplePhone implements Caller, Messenger {
    @Override
    public void call(String number) {
        System.out.println("SimplePhone is calling " + number);
    }

    @Override
    public void sendMessage(String number, String text) {
        System.out.println("SimplePhone sending message to " + number + "\nMessage: " + text);
    }
}
