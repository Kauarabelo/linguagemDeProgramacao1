package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Flor;

public class FlorController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoTipo;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoAltura;

    private Flor criarFlorDinamica() {
        String tipo = campoTipo.getText();
        String cor = campoCor.getText();
        double altura = 0;
        try {
            altura = Double.parseDouble(campoAltura.getText());
        } catch (NumberFormatException e) {
            // Caso o usuário não informe um número válido, define 0 como padrão.
            altura = 0;
        }
        return new Flor(tipo, cor, altura);
    }

    @FXML
    private void btnFlorescerClick(ActionEvent event) {
        criarFlorDinamica().florescer();
    }

    @FXML
    private void btnMurcharClick(ActionEvent event) {
        criarFlorDinamica().murchar();
    }

    @FXML
    private void btnCrescerClick(ActionEvent event) {
        criarFlorDinamica().crescer();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
