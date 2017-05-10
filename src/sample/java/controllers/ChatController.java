package sample.java.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import sample.java.utils.MyNavigation;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 3/23/2017.
 */
public class ChatController extends MyNavigation implements Initializable {

    @FXML
    private BorderPane chatContainer;

    @FXML
    private TextField chatField;

    @FXML
    ListView<String> chatListView;

    ObservableList<String> items = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        chatListView.setItems(items);

        chatField.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)) {
                items.add(chatField.getText());
                chatField.setText("");
            }
        });

        chatContainer.setPadding(new Insets(45, 0, 0, 0));
    }
}
