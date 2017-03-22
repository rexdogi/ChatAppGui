package sample.java.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import sample.Main;
import sample.java.utils.MyNavigation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController extends MyNavigation implements Initializable {

    @FXML
    public static BorderPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            loadScene("startScene");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BorderPane getRoot() {
        return rootPane;
    }

    public void loadRegisterScene() throws IOException {
        Parent register = FXMLLoader.load(getClass().getResource("../../resources/view/register.fxml"));
        Scene scene = new Scene(register, 800, 600);
        Main.getPrimaryStage().setScene(scene);
    }
}
