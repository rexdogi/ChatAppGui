package sample.java.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import sample.Main;
import sample.java.utils.MyNavigation;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 3/21/2017.
 */
public class MenuController extends MyNavigation implements Initializable {

    @FXML
    private MenuItem aboutBtn;
    @FXML
    private MenuItem helpBtn;
    @FXML
    private MenuItem fileChooser;
    @FXML
    private MenuBar menuBar;
    @FXML
    private CheckMenuItem colorCheckBox;

    private Alert alert = new Alert(Alert.AlertType.INFORMATION);
    private FileChooser fileChooserControl = new FileChooser();
    public final KeyCombination about = new KeyCodeCombination(KeyCode.A, KeyCombination.SHIFT_DOWN);
    public final KeyCombination help = new KeyCodeCombination(KeyCode.H, KeyCombination.SHIFT_DOWN);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            addOnKeyListener();
        } catch (IOException e) {
            e.printStackTrace();
        }
        aboutBtn.setOnAction(e -> initAbout());
        helpBtn.setOnAction(e -> initHelp());
        fileChooser.setOnAction(e ->  {
            File file = fileChooserControl.showOpenDialog(Main.getPrimaryStage());
            alert.setTitle("Failas");
            alert.setContentText("Pasirinktas failas " + file.getName());
            alert.showAndWait();
        });
        colorCheckBox.setOnAction(e -> {
            System.out.println("clicked");
            if(colorCheckBox.isSelected()) {
                menuBar.getStyleClass().add("bgColor");
            } else {
                menuBar.getStyleClass().remove("bgColor");
            }
        });

    }

    public void addOnKeyListener() throws IOException {
        Main.getPrimaryStage().addEventFilter(KeyEvent.KEY_RELEASED, event -> {
            if(about.match(event)) {
                initAbout();
            } else if(help.match(event)) {
                initHelp();
            }
        });
    }

    public void initHelp() {
        alert.setTitle("Help");
        String s = "Programa valdoma, pasirenkant asmeny iš 'Friend list', " +
                "toliau dešinėje esančiame lange galite rašyti žinutes šiam asmeniui. \n" +
                "------------------------------------ \n" +
                "Shift + h - atidaro help langą \n" +
                "Shift + a - atidaro about langą";
        alert.setContentText(s);
        alert.showAndWait();
    }

    public void initAbout() {
        alert.setTitle("About");
        String s = "Paulius Mikalauskas \n" +
                "I11-2 grupė 2017 metai \n" +
                "Klaipėdos valstybinė kolegija \n" +
                "------------------------------------ \n" + "" +
                "Java versija 1.8 \n" + "" +
                "Naudotos priemonės: \n" + "" +
                "";
        alert.setContentText(s);
        alert.showAndWait();
    }
}
