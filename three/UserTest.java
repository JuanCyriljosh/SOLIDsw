package three;

public class UserTest {
    public static void main(String[] args) {
        SimplePhone simplePhone = new SimplePhone();
        GalaxyPhone galaxyPhone = new GalaxyPhone();
        ApplePhone applePhone = new ApplePhone();

        System.out.println("\nSimple Phone:");
        simplePhone.call("09286601111");
        simplePhone.sendMessage("09286601111", "This is a TULFONE");

        System.out.println("\nGalaxy Phone:");
        galaxyPhone.call("09286602222");
        galaxyPhone.sendMessage("09286602222", "Hello how are you?");
        galaxyPhone.surf("google.com");
        galaxyPhone.snapPhoto();

        System.out.println("\nApple Phone:");
        applePhone.call("09286603333");
        applePhone.sendMessage("09286603333", "How are you, hello?");
        applePhone.surf("safari.com");
        applePhone.snapPhoto();
    }
}
