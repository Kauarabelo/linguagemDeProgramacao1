package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class XicaraCha {
    private double capacidade;
    private String cor;
    private String material;

    public XicaraCha(double capacidade, String cor, String material) {
        this.capacidade = capacidade;
        this.cor = cor;
        this.material = material;
    }

    public void encher() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Enchendo a xícara da cor " + cor + " com capacidade máxima de " + capacidade + "ml", null);
    }

    public void beber() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Bebendo na xícara feita de " + material, null);
    }

    public void lavar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Lavando a xícara feita de " + material, null);
    }
}
