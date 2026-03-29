import factorymethod.*;
import abstractfactory.*;

public class Main {
    public static void main(String[] args) {

        //Metodo factory
        System.out.println("========== Factory Method ==========");
        String msg = "Bem-vindo ao sistema!";
        new NotificationService(new EmailNotificationFactory()).notify(msg);
        new NotificationService(new SMSNotificationFactory()).notify(msg);
        new NotificationService(new PushNotificationFactory()).notify(msg);

        System.out.println();



        //Metodo absctract
        System.out.println("========== Abstract Factory ==========");

        System.out.println("\n=== Tema Claro ===");
        new Application(new LightThemeFactory()).renderUI();

        System.out.println("\n=== Tema Escuro ===");
        new Application(new DarkThemeFactory()).renderUI();
    }
}
