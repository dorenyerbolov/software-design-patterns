import Enums.DesignType;
import Managers.ConfigManager;
import Managers.WindowManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        WindowManager windowManager = WindowManager.getInstance(DesignType.HIGH_DETAILED);
        ConfigManager configManager = new ConfigManager("config.txt");
        configManager.loadConfig();

        windowManager.loadUI(configManager, primaryStage);
    }
}
