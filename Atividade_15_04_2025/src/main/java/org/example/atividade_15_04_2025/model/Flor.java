package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Flor {
    private String tipo;
    private String cor;
    private double altura;

    public Flor(String tipo, String cor, double altura) {
        this.tipo = tipo;
        this.cor = cor;
        this.altura = altura;
    }

    public void florescer() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "A flor do tipo " + tipo + " da cor " + cor + " está florescendo e já está com " + altura + " de altura", null);
    }

    public void murchar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "A flor " + tipo + " está murchando", null);
    }

    public void crescer() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Crescendo, já está com " + altura + " de altura", null);
    }
}
