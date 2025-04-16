package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void abrir() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Abrindo o livro \"" + titulo + "\" do autor " + autor, null);
    }

    public void folhear() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Folheando o livro \"" + titulo + "\" que tem " + numeroPaginas + " páginas", null);
    }

    public void fechar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "Fechando o livro do autor " + autor, null);
    }
}
