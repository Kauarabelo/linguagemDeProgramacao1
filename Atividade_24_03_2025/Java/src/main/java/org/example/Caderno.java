package org.example;

public class Caderno {
    private String tipo = "Caderno";
    private int qtdFolhas = 20;
    private String fabricante = "Faber Castell";

    public void folhas() {
        System.out.println("O livro tem " + qtdFolhas + " folhas");
    }

    public void folhasLidas() {
        System.out.println("Foram lidas do livro " + qtdFolhas + " folhas");
    }

    public void lido() {
        System.out.println("Lido");
    }
}
