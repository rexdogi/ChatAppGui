package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.java.utils.MyNavigation;

public class Main extends Application {


    public static Stage primaryStage;
    public static BorderPane root = new BorderPane();

    @Override
    public void start(Stage primaryStage) throws Exception{
        setPrimaryStage(primaryStage);
        Parent start = FXMLLoader.load(getClass().getResource("resources/view/mainContainer.fxml"));
        primaryStage.setTitle("Hello World");
        Scene welcomeScene = new Scene(root, 600, 600);
        welcomeScene.getStylesheets().add("sample/resources/css/layoutstyles.css");
        primaryStage.setScene(welcomeScene);
        primaryStage.show();
    }

    public static BorderPane getRoot() { return root; }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    private void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
