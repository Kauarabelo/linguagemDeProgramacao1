package org.example.atividade_15_04_2025;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ScreenManager.setPrimaryStage(stage);
        ScreenManager.changeScreen("view/home-view.fxml", "css/home.css");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

