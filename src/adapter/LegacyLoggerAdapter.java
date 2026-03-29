package adapter;

public class LegacyLoggerAdapter implements Logger {
    private final LegacyLogger legacy;

    public LegacyLoggerAdapter(LegacyLogger legacy) {
        this.legacy = legacy;
    }

    public void info(String message) {
        legacy.log("INFO", message);
    }

    public void error(String message) {
        legacy.log("ERROR", message);
    }
}
