package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 3/9/2017.
 */
public class RegisterController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void loadMainScene() throws IOException {
        System.out.println("clicked");
        Parent register = FXMLLoader.load(getClass().getResource("../../resources/view/sample.fxml"));
        Scene scene = new Scene(register, 800, 600);
        Main.getPrimaryStage().setScene(scene);
    }
}
