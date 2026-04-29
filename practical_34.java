import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // Create layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Labels and TextFields
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Add to GridPane
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button Action
        submitBtn.setOnAction(e -> {

            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            // Validation
            try {
                int rollNo = Integer.parseInt(rollText);
                int age = Integer.parseInt(ageText);

                if (!email.contains("@") || !email.contains(".")) {
                    showError("Invalid Email! Must contain '@' and '.'");
                    return;
                }

                // Success Alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Registration Successful");
                success.setHeaderText("Details Submitted");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                // Save to file using FileChooser
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        writer.write("Roll No: " + rollNo);
                        writer.newLine();
                        writer.write("Name: " + name);
                        writer.newLine();
                        writer.write("Age: " + age);
                        writer.newLine();
                        writer.write("Email: " + email);
                    } catch (Exception ex) {
                        showError("Error saving file!");
                    }
                }

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be valid integers!");
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    // Method to show error alert
    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Validation Error");
        error.setHeaderText("Invalid Input");
        error.setContentText(message);
        error.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
