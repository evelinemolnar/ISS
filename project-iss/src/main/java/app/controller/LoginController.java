package app.controller;

import app.model.Agent;
import app.service.MyException;
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

    }


    public void handleSubmitButtonAction(ActionEvent actionEvent) throws IOException {

        String username = usernameField.getText();
        String password = passwordField.getText();

        try{
            Object user = service.login(username, password);
            System.out.println(user.toString());
            if(user instanceof Agent) {
                try{
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
                    passwordField.setText("");}
                catch(IOException e){
                    throw new RuntimeException(e);
                }
            }
            else {
                try{
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
                catch(IOException e){
                    throw new RuntimeException(e);
                }
            }
        } catch (MyException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.show();
        }


    }

    public void setMainCtrl(MainController mainController) {
        this.mainCtrl = mainController;
    }

}
