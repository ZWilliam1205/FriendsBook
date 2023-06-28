package com.example.friendsbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetPhone;
    public ListView<Friends> friendList = new ListView<>();
    public Label lblName;
    public Label lblAge;
    public Label lblPhone;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int age = Integer.parseInt(textGetAge.getText());
        String phone = textGetPhone.getText();
        Friends newFriend = new Friends(name, age, phone);
        friendList.getItems().add(newFriend);
        textGetName.clear();
        textGetAge.clear();
        textGetPhone.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friends friend;
        friend = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(friend.name);
        lblAge.setText(Integer.toString(friend.getAge()));
        lblPhone.setText(friend.getPhone());
    }
}