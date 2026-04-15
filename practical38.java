// Write a program that creates a button and generate a click event to display.” Welcome to JavaFx”.
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class practical38 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me!");
        Label label = new Label(); // Empty label initially

        // Generate a click event using a lambda expression
        btn.setOnAction(e -> {
            label.setText("Welcome to JavaFx");
            System.out.println("Welcome to JavaFx"); // Also displays in the terminal
        });

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(btn, label);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Button Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
