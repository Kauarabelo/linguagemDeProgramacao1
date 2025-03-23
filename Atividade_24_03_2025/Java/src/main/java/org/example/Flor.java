package org.example;

public class Flor {
    private String tipo = "Rosa";
    private String cor  = "Vermelho";
    private double altura = 10.25;

    public void florescer() {
        System.out.println("Florescer");
    }

    public void murchar() {
        System.out.println("Murchando");
    }

    public void crescer() {
        System.out.println("Crescendo, ja está com " + altura + " de altura");
    }
}
