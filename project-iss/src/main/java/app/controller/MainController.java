package app.controller;

import app.model.Product;
import app.model.User;
import app.service.Observer;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Observer {

    private Stage stage = new Stage();

    public void setStage(Stage stage1)
    {
        this.stage = stage1;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void update(Product prod) {

    }

    @Override
    public void userLoggedIn(User user) {

    }

    @Override
    public void userLoggedOut(User user) {

    }
}
