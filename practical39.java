//Write a program to create a checkbox to choose one option among the given choices.
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class practical39 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label instructionLabel = new Label("Select your favorite programming language:");
        Label resultLabel = new Label("You selected: None");

        // Creating the checkboxes
        CheckBox chkJava = new CheckBox("Java");
        CheckBox chkPython = new CheckBox("Python");
        CheckBox chkCpp = new CheckBox("C++");

        // Event handler for Java checkbox
        chkJava.setOnAction(e -> {
            if (chkJava.isSelected()) {
                chkPython.setSelected(false);
                chkCpp.setSelected(false);
                resultLabel.setText("You selected: Java");
            }
        });

        // Event handler for Python checkbox
        chkPython.setOnAction(e -> {
            if (chkPython.isSelected()) {
                chkJava.setSelected(false);
                chkCpp.setSelected(false);
                resultLabel.setText("You selected: Python");
            }
        });

        // Event handler for C++ checkbox
        chkCpp.setOnAction(e -> {
            if (chkCpp.isSelected()) {
                chkJava.setSelected(false);
                chkPython.setSelected(false);
                resultLabel.setText("You selected: C++");
            }
        });

        // Layout setup
        VBox root = new VBox(15); // 15px spacing between elements
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(instructionLabel, chkJava, chkPython, chkCpp, resultLabel);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Checkbox Selection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}