package org.example.figuras;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import org.example.figuras.modelo.beans.*;

import javax.swing.text.TabExpander;

public class FigurasController {
    @FXML
    private Label mensaje;

    @FXML
    private TextField campoTexto1;

    @FXML
    private TextField campoTexto2;

    @FXML
    private SplitMenuButton menu;




    Figura figura;

    @FXML
    protected void onClickMenuItemCuadrado() {
        campoTexto2.setDisable(true);

        figura = new Cuadrado(Double.parseDouble(campoTexto1.getText()));
    }

    @FXML
    protected void onClickMenuItemCirculo() {
        campoTexto2.setDisable(true);

        figura = new Circulo(Double.parseDouble(campoTexto1.getText()));

    }

    @FXML
    protected void onClickItemTriangulo() {
        figura = new Triangulo(Double.parseDouble(campoTexto1.getText()), Double.parseDouble(campoTexto2.getText()));
    }

    @FXML
    protected void onClickItemRectangulo() {
        figura = new Rectangulo(Double.parseDouble(campoTexto1.getText()), Double.parseDouble(campoTexto2.getText()));
    }


    @FXML
    protected void onClickCalcular() {
        campoTexto2.setDisable(false);

        mensaje.setText(String.valueOf(figura.calcularArea()));
    }
}