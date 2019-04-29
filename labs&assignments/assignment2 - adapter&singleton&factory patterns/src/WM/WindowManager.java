package WM;

import Adapter.ConfigManager;
import DesignStyles.DesignStyle;
import DesignStyles.DesignStyleFactory;
import Enums.DesignType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class WindowManager {
    private static volatile WindowManager windowManager;
    private final DesignStyleFactory FACTORY = new DesignStyleFactory();
    private DesignStyle currentDesignStyle;

    private WindowManager(DesignType designType) { // private constructor to prevent others from instantiating this class
        currentDesignStyle = FACTORY.getDesignStyle(designType);
    }

    public static WindowManager getInstance(DesignType designType) {
        if (windowManager == null) {
            synchronized (WindowManager.class) {
                if (windowManager == null) {
                    windowManager = new WindowManager(designType);
                }
            }
        }
        return windowManager;
    }

    public void loadUI(ConfigManager configManager, Stage primaryStage) {
        try {
            ArrayList<Control> controls = new ArrayList<>();
            Pane layout = new Pane();

            primaryStage.setTitle("Window Manager");
            primaryStage.setOnCloseRequest(e -> primaryStage.close());

            while (configManager.hasNext()) {
                String[] line = configManager.next().split(",");
                Element currentElement = new Element(line[0], line[1], line[2], line[3]);

                if (currentElement.getName().equalsIgnoreCase("button")) {
                    Button button = new Button();
                    button.setText(currentElement.getInnerText());
                    button.setLayoutX(Double.parseDouble(currentElement.getX()));
                    button.setLayoutY(Double.parseDouble(currentElement.getY()));
                    controls.add(button);
                } else if (currentElement.getName().equalsIgnoreCase("textField")) {
                    TextField textField = new TextField();
                    textField.setPromptText(currentElement.getInnerText());
                    textField.setLayoutX(Double.parseDouble(currentElement.getX()));
                    textField.setLayoutY(Double.parseDouble(currentElement.getY()));
                    textField.setMaxWidth(100);
                    controls.add(textField);
                } else {
                    System.out.println("Wrong name");
                }
            }

            layout.getChildren().addAll(controls);

            layout.setPadding(new Insets(10));

            Scene scene = new Scene(layout, 400, 350);
            scene.getStylesheets().add((new File(currentDesignStyle.toString())).toURI().toURL().toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}