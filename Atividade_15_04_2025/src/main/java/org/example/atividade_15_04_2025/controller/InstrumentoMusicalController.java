package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.InstrumentoMusical;

public class InstrumentoMusicalController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoTipo;

    @FXML
    private TextField campoMaterial;

    @FXML
    private TextField campoFabricante;

    private InstrumentoMusical criarInstrumentoDinamico() {
        String tipo = campoTipo.getText();
        String material = campoMaterial.getText();
        String fabricante = campoFabricante.getText();
        return new InstrumentoMusical(tipo, material, fabricante);
    }

    @FXML
    private void btnTocarClick(ActionEvent event) {
        criarInstrumentoDinamico().tocar();
    }

    @FXML
    private void btnAfinarClick(ActionEvent event) {
        criarInstrumentoDinamico().afinar();
    }

    @FXML
    private void btnGuardarClick(ActionEvent event) {
        criarInstrumentoDinamico().guardar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
