package factorymethod;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMSFactory enviando: \"" + message + "\"");
    }
}
