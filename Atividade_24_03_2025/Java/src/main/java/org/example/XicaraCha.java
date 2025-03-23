package org.example;

public class XicaraCha {
    private double capacidade = 250;
    private String cor = "Verde com traços rosa";
    private String material  = "Barro";

    public void encher() {
        System.out.println("Enchendo a xicara no maximo da capacidade: " + capacidade);
    }

    public void beber() {
        System.out.println("Bebendo na xicara de cha");
    }

    public void lavar() {
        System.out.println("Lavado");
    }
}

