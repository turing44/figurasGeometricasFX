package org.example.figuras.modelo.beans;

public class Circulo extends Figura {
    private Double radio;
    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return (double) Math.round(Math.PI * radio * radio);
    }

}
