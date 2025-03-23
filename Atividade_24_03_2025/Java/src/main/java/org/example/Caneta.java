package org.example;

public class Caneta {
    private String cor = "Roxo";
    private String tipoTinta = "Esferografica";
    private double espessuraPonta = 1.5;

    public void escrever() {
        System.out.println("Escrevendo " + cor + " e " + tipoTinta);
    }

    public void recarregar() {
        System.out.println("Recarregando " + cor + " e " + tipoTinta);
    }

    public void tampar() {
        System.out.println("Caneta tampada");
    }
}
