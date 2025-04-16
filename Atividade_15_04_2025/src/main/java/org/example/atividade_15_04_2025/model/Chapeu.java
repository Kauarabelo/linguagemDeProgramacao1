package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;

import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Chapeu {
    private String estilo;
    private String cor;
    private int tamanho;

    public Chapeu(String estilo, String cor, int tamanho) {
        this.estilo = estilo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void vestir() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Vestindo chapéu da cor " + cor, null);
    }

    public void ajustar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Ajustando chapéu para o tamanho " + tamanho, null);
    }

    public void dobrar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Dobrando chapéu do estilo " + estilo, null);
    }
}
