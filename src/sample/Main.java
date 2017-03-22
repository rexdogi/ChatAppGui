package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {


    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        setPrimaryStage(primaryStage);
        Parent start = FXMLLoader.load(getClass().getResource("resources/view/startScene.fxml"));
        primaryStage.setTitle("Hello World");
        Scene welcomeScene = new Scene(start, 600, 600);
        welcomeScene.getStylesheets().add("sample/resources/css/layoutstyles.css");
        primaryStage.setScene(welcomeScene);
        primaryStage.show();
    }

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
