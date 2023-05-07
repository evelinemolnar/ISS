module project.iss.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.naming;
    requires net.bytebuddy;
    requires java.xml.bind;
    requires com.sun.xml.bind;
    requires com.fasterxml.classmate;


    opens app to javafx.fxml;
    opens app.controller to javafx.fxml;
    exports app.controller to javafx.fxml;
    exports app to javafx.graphics;
}