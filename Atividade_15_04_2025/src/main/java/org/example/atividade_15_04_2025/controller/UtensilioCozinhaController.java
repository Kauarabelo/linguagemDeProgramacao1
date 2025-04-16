package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.UtensilioCozinha;

import static org.example.atividade_15_04_2025.ScreenManager.changeScreen;

public class UtensilioCozinhaController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoTipo;

    @FXML
    private TextField campoMaterial;

    @FXML
    private TextField campoTamanho;

    private UtensilioCozinha criarUtensilioDinamico() {
        String tipo = campoTipo.getText();
        String material = campoMaterial.getText();
        String tamanho = campoTamanho.getText();
        return new UtensilioCozinha(tipo, material, tamanho);
    }

    @FXML
    private void btnGuardarClick(ActionEvent event) {
        criarUtensilioDinamico().guardar();
    }

    @FXML
    private void btnLimparClick(ActionEvent event) {
        criarUtensilioDinamico().limpar();
    }

    @FXML
    private void btnUsarClick(ActionEvent event) {
        criarUtensilioDinamico().usar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        changeScreen("view/home-view.fxml", "css/home.css");
    }
}
