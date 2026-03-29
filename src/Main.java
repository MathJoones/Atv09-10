import factorymethod.*;
import abstractfactory.*;
import adapter.*;
import composite.*;

public class Main {
    public static void main(String[] args) {

        // ── Factory Method ──────────────────────────────────────────
        System.out.println("========== Factory Method ==========");
        String msg = "Bem-vindo ao sistema!";
        new NotificationService(new EmailNotificationFactory()).notify(msg);
        new NotificationService(new SMSNotificationFactory()).notify(msg);
        new NotificationService(new PushNotificationFactory()).notify(msg);

        System.out.println();

        // ── Abstract Factory ────────────────────────────────────────
        System.out.println("========== Abstract Factory ==========");
        System.out.println("\n=== Tema Claro ===");
        new Application(new LightThemeFactory()).renderUI();
        System.out.println("\n=== Tema Escuro ===");
        new Application(new DarkThemeFactory()).renderUI();

        System.out.println();

        // ── Adapter ─────────────────────────────────────────────────
        System.out.println("========== Adapter ==========");
        LegacyLogger legacy = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacy);
        adapter.Application logApp = new adapter.Application(logger);
        logApp.run();

        System.out.println();

        // ── Composite ───────────────────────────────────────────────
        System.out.println("========== Composite ==========");

        composite.Directory familia = new composite.Directory("familia");
        familia.add(new composite.File("casal.jpg",  2_000_000));
        familia.add(new composite.File("filhos.jpg", 1_000_000));

        composite.Directory fotos = new composite.Directory("fotos");
        fotos.add(new composite.File("vacacao.jpg", 3_000_000));
        fotos.add(familia);

        composite.Directory docs = new composite.Directory("docs");
        docs.add(new composite.File("projeto.pdf",    2_000_000));
        docs.add(new composite.File("relatorio.docx", 1_000_000));

        composite.Directory root = new composite.Directory("root");
        root.add(docs);
        root.add(fotos);
        root.add(new composite.File("readme.txt", 500_000));

        root.display("");
        System.out.println();
        System.out.printf("Tamanho total: %.1f MB%n",             root.getSize()    / 1_000_000.0);
        System.out.printf("Tamanho da pasta 'docs': %.1f MB%n",   docs.getSize()    / 1_000_000.0);
        System.out.printf("Tamanho da pasta 'familia': %.1f MB%n", familia.getSize() / 1_000_000.0);
    }
}
