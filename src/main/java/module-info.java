module org.example.figuras {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.figuras to javafx.fxml;
    exports org.example.figuras;
}