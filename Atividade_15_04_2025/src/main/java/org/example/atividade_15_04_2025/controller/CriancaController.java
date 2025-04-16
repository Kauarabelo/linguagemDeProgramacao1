package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Crianca;

public class CriancaController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoIdade;

    @FXML
    private TextField campoAltura;

    private Crianca criarCriancaDinamica() {
        String nome = campoNome.getText();
        int idade = 0;
        double altura = 0;
        try {
            idade = Integer.parseInt(campoIdade.getText());
        } catch (NumberFormatException e) {
            // Pode definir um valor padrão ou exibir uma mensagem de erro
            idade = 0;
        }
        try {
            altura = Double.parseDouble(campoAltura.getText());
        } catch (NumberFormatException e) {
            altura = 0;
        }
        return new Crianca(nome, idade, altura);
    }

    @FXML
    private void btnBrincarClick(ActionEvent event) {
        criarCriancaDinamica().brincar();
    }

    @FXML
    private void btnComerClick(ActionEvent event) {
        criarCriancaDinamica().comer();
    }

    @FXML
    private void btnEstudarClick(ActionEvent event) {
        criarCriancaDinamica().estudar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
