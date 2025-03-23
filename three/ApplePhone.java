package three;

public class ApplePhone implements Caller, Messenger, Browser, Camera {
    @Override
    public void call(String number) {
        System.out.println("ApplePhone is calling " + number);
    }

    @Override
    public void sendMessage(String number, String text) {
        System.out.println("ApplePhone sending message to " + number + "\nMessage: " + text);
    }

    @Override
    public void surf(String url) {
        System.out.println("ApplePhone browsing: " + url);
    }

    @Override
    public void snapPhoto() {
        System.out.println("ApplePhone captured a photo.");
    }
}