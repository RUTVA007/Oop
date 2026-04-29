import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        // Scale factor to convert percentage to height
        double scale = 3; // 1% = 3 pixels

        // Create bars
        VBox projectsBar = createBar("Projects — 20%", 20, Color.RED, scale);
        VBox quizzesBar = createBar("Quizzes — 10%", 10, Color.BLUE, scale);
        VBox midtermBar = createBar("Midterm Exams — 30%", 30, Color.GREEN, scale);
        VBox finalBar = createBar("Final Exam — 40%", 40, Color.ORANGE, scale);

        // Arrange bars horizontally
        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projectsBar, quizzesBar, midtermBar, finalBar);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    // Method to create a single bar with label
    private VBox createBar(String labelText, double percentage, Color color, double scale) {

        // Rectangle height proportional to percentage
        Rectangle bar = new Rectangle(50, percentage * scale);
        bar.setFill(color);

        // Label under the bar
        Text label = new Text(labelText);

        // VBox to stack bar and label
        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
