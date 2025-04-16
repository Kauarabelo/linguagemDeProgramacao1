package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;

import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Caderno {
    private String tipo;
    private int qtdFolhas;
    private String fabricante;

    public Caderno(String tipo, int qtdFolhas, String fabricante) {
        this.tipo = tipo;
        this.qtdFolhas = qtdFolhas;
        this.fabricante = fabricante;
    }

    public void mostrarTipo() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null, "O caderno é do tipo " + tipo, null);
    }

    public void mostrarFolhas() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null, "O caderno tem " + qtdFolhas + " folhas", null);
    }

    public void mostrarFabricante() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null, "O fabricante do caderno é a(o) " + fabricante, null);
    }
}
