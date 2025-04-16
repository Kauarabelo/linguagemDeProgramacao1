package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Chapeu;

public class ChapeuController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoEstilo;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoTamanho;

    private Chapeu criarChapeuDinamico() {
        String estilo = campoEstilo.getText();
        String cor = campoCor.getText();
        int tamanho = 0;
        try {
            tamanho = Integer.parseInt(campoTamanho.getText());
        } catch (NumberFormatException e) {
            tamanho = 0;
        }

        return new Chapeu(estilo, cor, tamanho);
    }

    @FXML
    private void btnVestirClick(ActionEvent event) {
        criarChapeuDinamico().vestir();
    }

    @FXML
    private void btnAjustarClick(ActionEvent event) {
        criarChapeuDinamico().ajustar();
    }

    @FXML
    private void btnDobrarClick(ActionEvent event) {
        criarChapeuDinamico().dobrar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
