import Adapter.AdvancedAdapter;
import Adapter.ConfigManager;
import Adapter.TextParser;
import Adapter.XmlParser;
import Enums.DesignType;
import WM.WindowManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            WindowManager windowManager = WindowManager.getInstance(DesignType.SIMPLISTIC);

            menu:
            while (true) {
                System.out.println("Please, select desired option: ");
                System.out.println("[1] - Read config from txt file");
                System.out.println("[2] - Read config from xml file");
                System.out.println("[3] - Quit");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        /* reading from txt file */
                        ConfigManager textParser = new TextParser();
                        textParser.loadConfig();

                        windowManager.loadUI(textParser, primaryStage);
                        break menu;
                    case "2":
                        /* adapting to read from xml file */
                        ConfigManager xmlParser = new AdvancedAdapter(new XmlParser());
                        xmlParser.loadConfig();

                        windowManager.loadUI(xmlParser, primaryStage);
                        break menu;
                    case "3":
                        System.exit(666);
                    default:
                        System.out.println("Wrong input! Try again.");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
