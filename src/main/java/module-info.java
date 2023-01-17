module com.example.potlas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.potlas to javafx.fxml;
    exports com.example.potlas;
}