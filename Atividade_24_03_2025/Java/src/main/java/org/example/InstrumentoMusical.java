package org.example;

public class InstrumentoMusical {
    private String tipo = "Bateria";
    private String material  = "Aluminio";
    private String fabricante = "Dell";

    public void tocar() {
        System.out.println("Tocando Instrumento");
    }

    public void afinar() {
        System.out.println("Afinando Instrumento");
    }

    public void guardar() {
        System.out.println("Guardado Instrumento");
    }
}
