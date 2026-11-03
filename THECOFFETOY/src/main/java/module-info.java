module com.example.thecoffetoy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thecoffetoy to javafx.fxml;
    exports com.example.thecoffetoy;
}