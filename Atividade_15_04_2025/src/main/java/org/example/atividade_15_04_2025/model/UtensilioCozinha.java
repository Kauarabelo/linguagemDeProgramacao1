package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class UtensilioCozinha {
    private String tipo;
    private String material;
    private String tamanho; // Representado como String para flexibilizar a entrada

    public UtensilioCozinha(String tipo, String material, String tamanho) {
        this.tipo = tipo;
        this.material = material;
        this.tamanho = tamanho;
    }

    public void usar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Usando o(a) " + tipo + " de " + material, null);
    }

    public void limpar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Utensílio " + tipo + " de " + tamanho + "cm, está limpo", null);
    }

    public void guardar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Utensílio de " + material + " foi guardado", null);
    }
}
