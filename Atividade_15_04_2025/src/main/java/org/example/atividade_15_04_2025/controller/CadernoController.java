package org.example.atividade_15_04_2025.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Caderno;

public class CadernoController {

    @FXML
    private TextField campoTipo;

    @FXML
    private TextField campoFolhas;

    @FXML
    private TextField campoFabricante;

    private Caderno criarCadernoDinamico() {
        String tipo = campoTipo.getText();
        String fabricante = campoFabricante.getText();
        int folhas = 0;
        try {
            folhas = Integer.parseInt(campoFolhas.getText());
        } catch (NumberFormatException e) {
            folhas = 0;
        }
        return new Caderno(tipo, folhas, fabricante);
    }

    @FXML
    public void btnTipoClick() {
        Caderno caderno = criarCadernoDinamico();
        caderno.mostrarTipo();
    }

    @FXML
    public void btnFolhaClick() {
        Caderno caderno = criarCadernoDinamico();
        caderno.mostrarFolhas();
    }

    @FXML
    public void btnFabricanteClick() {
        Caderno caderno = criarCadernoDinamico();
        caderno.mostrarFabricante();
    }

    @FXML
    public void btnVoltarClick() {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
