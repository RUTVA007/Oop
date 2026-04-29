import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextDisplay extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox();
        vbox.setSpacing(15); // spacing between texts
        vbox.setStyle("-fx-alignment: center;"); // center horizontally

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {

            Text text = new Text("Text " + i);

            // Set font: Times New Roman, Bold + Italic, size 22
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            // Random color
            Color randomColor = Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());
            text.setFill(randomColor);

            // Random opacity (0.3 to 1.0)
            double opacity = 0.3 + (0.7 * random.nextDouble());
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("Random Styled Texts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
