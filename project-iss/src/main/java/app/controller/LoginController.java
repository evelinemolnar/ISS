package app.controller;

import app.service.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public TextField usernameField;
    public PasswordField passwordField;
    public Label messageToUser;

    public Button signInButton;
    public ComboBox<String> comboBox;

    private Stage stage = new Stage();

    public void setStage(Stage stage1)
    {
        this.stage = stage1;
    }


    Service service;


    public void setService(Service s){
        this.service = s;
    }


    Parent mainPageParent;
    public void setParent(Parent p){
        mainPageParent = p;
    }

    private MainController mainCtrl;


    @FXML
    public void initialize() throws IOException {

        usernameField.setText("");
        passwordField.setText("");

        usernameField.setPromptText("username");
        passwordField.setPromptText("password");
        messageToUser.setText("");

        comboBox.getItems().add("admin");
        comboBox.getItems().add("agent");

    }


    public void handleSubmitButtonAction(ActionEvent actionEvent) throws IOException {

        String nume = usernameField.getText();
        String passwd = passwordField.getText();
        String type = comboBox.getSelectionModel().getSelectedItem().toString();


        if(type.equals("agent"))
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/main-view.fxml"));
            AnchorPane root = loader.load();
            MainController controller = loader.getController();
            Scene scene = new Scene(root, 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Agent");
            stage.setResizable(false);
            stage.setScene(scene);
            controller.setStage(stage);
            stage.show();
            usernameField.setText("");
            passwordField.setText("");

        }
        else if ( type.equals("admin")){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/admin-view.fxml"));
            AnchorPane root = loader.load();
            AdminController controller = loader.getController();
            Scene scene = new Scene(root, 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Admin");
            stage.setResizable(false);
            stage.setScene(scene);
            controller.setStage(stage);
            stage.show();
            usernameField.setText("");
            passwordField.setText("");
        }
        else
        {
            messageToUser.setText("User not found!");
            messageToUser.setTextFill(Color.DARKRED);
            passwordField.setText("");
        }

    }

    public void setMainCtrl(MainController mainController) {
        this.mainCtrl = mainController;
    }

}
