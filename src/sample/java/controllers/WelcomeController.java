package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;
import sample.java.utils.MyNavigation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 3/9/2017.
 */
public class WelcomeController extends MyNavigation implements Initializable {

    @FXML
    Button loginBtn;
    @FXML
    Button registerBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        registerBtn.setOnAction(e -> {
            try {
                loadScene("register");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        loginBtn.setOnAction(e -> {
            try {
                loadScene("main");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
