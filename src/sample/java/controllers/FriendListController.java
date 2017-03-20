package sample.java.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Paulius on 2/23/2017.
 */

public class FriendListController implements Initializable {

    @FXML
    VBox leftVBox;
    @FXML
    ListView<String> myListView;
    @FXML
    ScrollPane myListScrollPane;
    @FXML
    TextField searchField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        leftVBox.getStyleClass().add("pane");
        myListScrollPane.setFitToHeight(true);
        myListScrollPane.setPrefHeight(1000);
        myListView.prefWidthProperty().bind(myListScrollPane.widthProperty());
        myListView.prefHeightProperty().bind(myListScrollPane.heightProperty());
        myListScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        ObservableList<String> items = FXCollections.observableArrayList(
                "Single", "Double", "Suite", "Family App",
                "Single", "Double", "Suite", "Family App"
        );
        FilteredList<String> filteredData = new FilteredList<>(items, s -> true);
        myListView.setItems(filteredData);

        searchField.textProperty().addListener( observable -> {
            String filter = searchField.getText();
            if(filter == null || filter.length() == 0) {
                filteredData.setPredicate(s -> true);
            }
            else {
                filteredData.setPredicate(s -> s.toLowerCase().contains(filter));
            }
        });
    }
}
