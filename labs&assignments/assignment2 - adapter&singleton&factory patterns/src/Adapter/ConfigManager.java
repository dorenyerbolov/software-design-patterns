package Adapter;

public interface ConfigManager {
    void loadConfig();

    boolean hasNext();

    String next();
}
