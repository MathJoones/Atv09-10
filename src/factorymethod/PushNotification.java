package factorymethod;

public class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("PushFactory enviando: \"" + message + "\"");
    }
}
