package org.example.atividade_15_04_2025.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Caneta;

public class CanetaController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoTipoTinta;

    @FXML
    private TextField campoEspessura;

    private Caneta criarCanetaDinamica() {
        String cor = campoCor.getText();
        String tipoTinta = campoTipoTinta.getText();
        double espessura = 0;
        try {
            espessura = Double.parseDouble(campoEspessura.getText());
        } catch (NumberFormatException e) {
            espessura = 0;
        }

        return new Caneta(cor, tipoTinta, espessura);
    }

    @FXML
    private void btnEscreverClick(ActionEvent event) {
        criarCanetaDinamica().escrever();
    }

    @FXML
    private void btnRecarregarClick(ActionEvent event) {
        criarCanetaDinamica().recarregar();
    }

    @FXML
    private void btnTamparClick(ActionEvent event) {
        criarCanetaDinamica().tampar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
