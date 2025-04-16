package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import org.example.atividade_15_04_2025.ScreenManager;

import java.lang.reflect.Method;

public class HomeController {

    @FXML
    private GridPane gridPane;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    public void initialize() {
        comboBox.getItems().addAll(
                "Caderno",
                "Caneta",
                "Chapéu",
                "Criança",
                "Ferramenta de Jardinagem",
                "Flor",
                "Instrumento Musical",
                "Livro",
                "Utensílio de Cozinha",
                "Xícara de Chá"
        );
    }

    @FXML
    private void btnIrClick() {
        String opcaoSelecionada = comboBox.getValue();
        if (opcaoSelecionada == null) return;

        switch (opcaoSelecionada) {
            case "Caderno": ScreenManager.changeScreen("view/caderno-view.fxml", "css/classes.css");; break;
            case "Caneta": ScreenManager.changeScreen("view/caneta-view.fxml", "css/classes.css");; break;
            case "Chapéu": ScreenManager.changeScreen("view/chapeu-view.fxml", "css/classes.css");; break;
            case "Criança": ScreenManager.changeScreen("view/crianca-view.fxml", "css/classes.css");; break;
            case "Ferramenta de Jardinagem": ScreenManager.changeScreen("view/ferramentaJardinagem-view.fxml", "css/classes.css"); break;
            case "Flor": ScreenManager.changeScreen("view/flor-view.fxml", "css/classes.css");; break;
            case "Instrumento Musical": ScreenManager.changeScreen("view/instrumentoMusical-view.fxml", "css/classes.css");; break;
            case "Livro": ScreenManager.changeScreen("view/livro-view.fxml", "css/classes.css");; break;
            case "Utensílio de Cozinha": ScreenManager.changeScreen("view/utensilioCozinha-view.fxml", "css/classes.css");; break;
            case "Xícara de Chá": ScreenManager.changeScreen("view/xicaraCha-view.fxml", "css/classes.css");; break;
        }
    }

}
