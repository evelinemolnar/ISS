package app.controller;

import app.model.Product;
import app.service.Observer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    private Stage stage = new Stage();

    public void setStage(Stage stage1)
    {
        this.stage = stage1;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



}
