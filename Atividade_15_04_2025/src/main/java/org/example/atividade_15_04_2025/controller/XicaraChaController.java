package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.XicaraCha;

public class XicaraChaController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoCapacidade;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoMaterial;

    private XicaraCha criarXicaraDinamica() {
        double capacidade = 0;
        try {
            capacidade = Double.parseDouble(campoCapacidade.getText());
        } catch (NumberFormatException e) {
            // Caso o usuário não informe um número válido, define 250 ml como padrão.
            capacidade = 250;
        }
        String cor = campoCor.getText();
        String material = campoMaterial.getText();
        return new XicaraCha(capacidade, cor, material);
    }

    @FXML
    private void btnBeberClick(ActionEvent event) {
        criarXicaraDinamica().beber();
    }

    @FXML
    private void btnEncherClick(ActionEvent event) {
        criarXicaraDinamica().encher();
    }

    @FXML
    private void btnLavarClick(ActionEvent event) {
        criarXicaraDinamica().lavar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
