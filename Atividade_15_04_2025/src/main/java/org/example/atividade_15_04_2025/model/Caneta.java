package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;

import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Caneta {
    private String cor;
    private String tipoTinta;
    private double espessuraPonta;

    public Caneta(String cor, String tipoTinta, double espessuraPonta) {
        this.cor = cor;
        this.tipoTinta = tipoTinta;
        this.espessuraPonta = espessuraPonta;
    }

    public void escrever() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Escrevendo com cor " + cor + " e tinta " + tipoTinta, null);
    }

    public void recarregar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Recarregando com tinta " + tipoTinta + " e cor " + cor, null);
    }

    public void tampar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Caneta tampada - espessura da ponta: " + espessuraPonta, null);
    }
}
