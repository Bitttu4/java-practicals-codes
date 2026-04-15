// Write a program that displays the color of a circle as red when the mouse button is pressed and as blue when the mouse button is released.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class practical40 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle with a radius of 50
        Circle circle = new Circle(50);
        
        // Initial color is blue (since the mouse is released by default)
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);

        // Change color to red when the mouse button is pressed
        circle.setOnMousePressed(e -> {
            circle.setFill(Color.RED);
        });

        // Change color back to blue when the mouse button is released
        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.BLUE);
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Mouse Event Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
