package sample.java.utils;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import sample.Main;
import sample.java.controllers.MainController;

import java.io.IOException;

/**
 * Created by Paulius on 3/9/2017.
 */
public class MyNavigation {

    private static Scene currentScene;


    public void loadScene(String name) throws IOException {
        Parent res = FXMLLoader.load(getClass().getResource("../../resources/view/" + name + ".fxml"));
        Scene scene = new Scene(res);
        scene.getStylesheets().add("sample/resources/css/layoutstyles.css");
        Main.getPrimaryStage().setScene(scene);
    }

    public void loadScene(String name, int width, int height) throws IOException {
        Parent res = FXMLLoader.load(getClass().getResource("../../resources/view/" + name + ".fxml"));
        Scene scene = new Scene(res, width, height);
        scene.getStylesheets().add("sample/resources/css/layoutstyles.css");
        Main.getPrimaryStage().setScene(scene);
    }
}
