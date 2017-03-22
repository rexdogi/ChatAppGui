package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import sample.Main;
import sample.java.utils.MyNavigation;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 3/9/2017.
 */
public class WelcomeController extends MyNavigation implements Initializable {

    @FXML
    Button loginBtn;
    @FXML
    Button registerBtn;

    private Alert alert = new Alert(Alert.AlertType.ERROR);


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        alert.setTitle("Register");
        String s = "Registracija laikinai neveikia";
        alert.setContentText(s);

        registerBtn.setOnAction(e -> alert.showAndWait());
        loginBtn.setOnAction(e -> {
            try {
                loadScene("main", 600, 600);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
