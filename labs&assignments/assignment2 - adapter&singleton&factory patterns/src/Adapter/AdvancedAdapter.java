package Adapter;

public class AdvancedAdapter implements ConfigManager {
    private AdvancedConfigManager advancedConfigManager;

    public AdvancedAdapter(AdvancedConfigManager advancedConfigManager) {
        this.advancedConfigManager = advancedConfigManager;
    }

    @Override
    public void loadConfig() {
        advancedConfigManager.loadXML();
    }

    @Override
    public boolean hasNext() {
        return advancedConfigManager.hasNext();
    }

    @Override
    public String next() {
        return advancedConfigManager.next();
    }
}
