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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    BorderPane myBorderPane;
    @FXML
    MenuItem registerBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        registerBtn.setOnAction(event -> {
            try {
                loadRegisterScene();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void loadRegisterScene() throws IOException {
        Parent register = FXMLLoader.load(getClass().getResource("../../resources/view/register.fxml"));
        Scene scene = new Scene(register, 800, 600);
        Main.getPrimaryStage().setScene(scene);
    }
}
