package app;

import app.controller.LoginController;
import app.repository.HibernateUtils;
import app.service.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

public class MainFX extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("/login-view.fxml")); //URL
        AnchorPane root = loader.load();
        LoginController controller = loader.getController();
        Scene scene = new Scene(root, 380, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        SessionFactory sessionFactory = HibernateUtils.initialize();
        controller.setService(Service.getInstance(sessionFactory));
        stage.setResizable(false);
        controller.setStage(stage);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
