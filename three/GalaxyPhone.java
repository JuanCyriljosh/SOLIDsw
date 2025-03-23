package three;

public class GalaxyPhone implements Caller, Messenger, Browser, Camera {
    @Override
    public void call(String number) {
        System.out.println("GalaxyPhone is calling " + number);
    }

    @Override
    public void sendMessage(String number, String text) {
        System.out.println("GalaxyPhone sending message to " + number + "\nMessage: " + text);
    }

    @Override
    public void surf(String url) {
        System.out.println("GalaxyPhone browsing: " + url);
    }

    @Override
    public void snapPhoto() {
        System.out.println("GalaxyPhone captured a photo.");
    }
}