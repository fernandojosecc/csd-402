/**
 * Fernando Contreras
 * Assignment 11.2: JavaFX HBox and GridPane Demo
 * July 29, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program demonstrates two JavaFX layout panes,
 * HBox and GridPane. The HBox arranges a row of buttons horizontally,
 * and the GridPane arranges a simple login-style form with labels
 * and text fields aligned in rows and columns.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxGridPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        // --- HBox Example: a horizontal row of buttons ---
        HBox hbox = new HBox(10); // spacing of 10 pixels between children
        hbox.setPadding(new Insets(15));

        Button btn1 = new Button("Save");
        Button btn2 = new Button("Cancel");
        Button btn3 = new Button("Help");

        hbox.getChildren().addAll(btn1, btn2, btn3);

        // --- GridPane Example: a simple login form ---
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        Label userLabel = new Label("Username:");
        TextField userField = new TextField();

        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();

        Button loginBtn = new Button("Login");

        // Row 0: username label + field
        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);

        // Row 1: password label + field
        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);

        // Row 2: login button
        grid.add(loginBtn, 1, 2);

        // --- Combine both layouts into one VBox for display ---
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            new Label("HBox Example - Button Row:"), hbox,
            new Label("GridPane Example - Login Form:"), grid
        );

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("HBox and GridPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}