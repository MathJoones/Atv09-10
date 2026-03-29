package factorymethod;

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("EmailFactory enviando: \"" + message + "\"");
    }
}
