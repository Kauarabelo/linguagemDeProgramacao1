package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class InstrumentoMusical {
    private String tipo;
    private String material;
    private String fabricante;

    public InstrumentoMusical(String tipo, String material, String fabricante) {
        this.tipo = tipo;
        this.material = material;
        this.fabricante = fabricante;
    }

    public void tocar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Tocando o instrumento do tipo " + tipo + " de " + material + " feito pela " + fabricante, null);
    }

    public void afinar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Afinando o instrumento fabricado por " + fabricante, null);
    }

    public void guardar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Guardando a(o) " + tipo, null);
    }
}
