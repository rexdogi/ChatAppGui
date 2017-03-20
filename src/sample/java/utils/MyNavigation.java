package sample.java.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;

import java.io.IOException;

/**
 * Created by Paulius on 3/9/2017.
 */
public class MyNavigation {

    public void loadScene(String name) throws IOException {
        Parent res = FXMLLoader.load(getClass().getResource("../../resources/view/" + name + ".fxml"));
        Scene scene = new Scene(res, 800, 600);
        Main.getPrimaryStage().setScene(scene);
    }

    public void loadScene(String name, int width, int height) throws IOException {
        Parent res = FXMLLoader.load(getClass().getResource("../../resources/view/" + name + ".fxml"));
        Scene scene = new Scene(res, width, height);
        Main.getPrimaryStage().setScene(scene);
    }
}
