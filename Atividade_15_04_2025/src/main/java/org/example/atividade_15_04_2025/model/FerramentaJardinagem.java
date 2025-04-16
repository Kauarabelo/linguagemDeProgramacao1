package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class FerramentaJardinagem {
    private String tipo;
    private String material;
    private double peso;

    public FerramentaJardinagem(String tipo, String material, double peso) {
        this.tipo = tipo;
        this.material = material;
        this.peso = peso;
    }

    public void cavar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Cavando com a ferramenta de " + tipo + " fabricada em " + material, null);
    }

    public void podar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Podando com a ferramenta que pesa " + peso + "kg", null);
    }

    public void armazenar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Armazenando a ferramenta: " + tipo + " de " + material + ", pesando " + peso + "kg", null);
    }
}
