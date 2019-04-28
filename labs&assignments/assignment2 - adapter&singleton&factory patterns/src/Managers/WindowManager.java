package Managers;

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
import java.io.FileNotFoundException;
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

    public void loadUI(ConfigManager config, Stage stage) throws FileNotFoundException, IOException {
        ConfigManager configManager = config;
        ArrayList<Control> controls = new ArrayList<>();
        Pane layout = new Pane();

        stage.setTitle("Window Manager");
        stage.setOnCloseRequest(e -> stage.close());

        while (configManager.hasNext()) {
            String[] line = configManager.next().split(",");
            Node currentNode = new Node(line[0], line[1], line[2], line[3]);

            if (currentNode.getNodeName().equalsIgnoreCase("button")) {
                Button button = new Button();
                button.setText(currentNode.getInnerText());
                button.setLayoutX(Double.parseDouble(currentNode.getX()));
                button.setLayoutY(Double.parseDouble(currentNode.getY()));
                controls.add(button);
            } else if (currentNode.getNodeName().equalsIgnoreCase("textField")) {
                TextField textField = new TextField();
                textField.setPromptText(currentNode.getInnerText());
                textField.setLayoutX(Double.parseDouble(currentNode.getX()));
                textField.setLayoutY(Double.parseDouble(currentNode.getY()));
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

        stage.setScene(scene);
        stage.show();
    }

}