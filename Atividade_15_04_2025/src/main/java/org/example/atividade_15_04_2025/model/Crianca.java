package org.example.atividade_15_04_2025.model;

import javafx.scene.control.Alert;
import static org.example.atividade_15_04_2025.util.AlertHelper.showAlert;

public class Crianca {
    private String nome;
    private int idade;
    private double altura;

    public Crianca(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void brincar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "A criança " + nome + " de " + idade + " anos está brincando no parque!", null);
    }

    public void comer() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                nome + " com " + altura + "m está comendo.", null);
    }

    public void estudar() {
        showAlert(Alert.AlertType.INFORMATION, "Mensagem", null,
                "A criança " + nome + " de " + idade + " anos está estudando.", null);
    }
}
