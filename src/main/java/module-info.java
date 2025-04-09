module org.example.figuras {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.figuras to javafx.fxml;
    exports org.example.figuras;
}