package org.example.figuras.modelo.beans;

public class Cuadrado extends Figura {
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }
}
