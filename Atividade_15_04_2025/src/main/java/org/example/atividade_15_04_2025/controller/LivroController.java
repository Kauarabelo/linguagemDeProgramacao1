package org.example.atividade_15_04_2025.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.atividade_15_04_2025.ScreenManager;
import org.example.atividade_15_04_2025.model.Livro;

public class LivroController {

    @FXML
    private ImageView imagemItem;

    @FXML
    private TextField campoTitulo;

    @FXML
    private TextField campoAutor;

    @FXML
    private TextField campoNumeroPaginas;

    private Livro criarLivroDinamico() {
        String titulo = campoTitulo.getText();
        String autor = campoAutor.getText();
        int numeroPaginas = 0;
        try {
            numeroPaginas = Integer.parseInt(campoNumeroPaginas.getText());
        } catch (NumberFormatException e) {
            numeroPaginas = 0;
        }
        return new Livro(titulo, autor, numeroPaginas);
    }

    @FXML
    private void btnAbrirClick(ActionEvent event) {
        criarLivroDinamico().abrir();
    }

    @FXML
    private void btnFolhearClick(ActionEvent event) {
        criarLivroDinamico().folhear();
    }

    @FXML
    private void btnFecharClick(ActionEvent event) {
        criarLivroDinamico().fechar();
    }

    @FXML
    private void btnVoltarClick(ActionEvent event) {
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
    }
}
