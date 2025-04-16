package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.FerramentaJardinagem;

public class FerramentaJardinagemController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoTipo;

    @FXML
    private TextField campoMaterial;

    @FXML
    private TextField campoPeso;

    private FerramentaJardinagem criarFerramentaDinamica() {
        String tipo = campoTipo.getText();
        String material = campoMaterial.getText();
        double peso = 0;
        try {
            peso = Double.parseDouble(campoPeso.getText());
        } catch (NumberFormatException e) {
            peso = 0;
        }
        return new FerramentaJardinagem(tipo, material, peso);
    }

    @FXML
    private void btnCavarClick(ActionEvent event) {
        criarFerramentaDinamica().cavar();
    }

    @FXML
    private void btnPodarClick(ActionEvent event) {
        criarFerramentaDinamica().podar();
    }

    @FXML
    private void btnArmazenarClick(ActionEvent event) {
        criarFerramentaDinamica().armazenar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
