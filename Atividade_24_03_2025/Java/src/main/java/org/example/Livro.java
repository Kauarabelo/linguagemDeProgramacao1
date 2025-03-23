package org.example;

public class Livro {
    private String titulo = "Pequeno Principe";
    private String autor = "Martin";
    private int numeroPaginas = 254;

    public void abrir() {
        System.out.println("Aberto");
    }

    public void folhear() {
        System.out.println("Foleando");
    }

    public void fechar() {
        System.out.println("Fechado e guardado");
    }
}