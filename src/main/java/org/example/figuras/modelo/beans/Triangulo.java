package org.example.figuras.modelo;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;
    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }
}
