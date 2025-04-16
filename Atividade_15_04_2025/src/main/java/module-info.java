module org.example.atividade_15_04_2025 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.atividade_15_04_2025 to javafx.fxml;
    opens org.example.atividade_15_04_2025.controller to javafx.fxml;
    exports org.example.atividade_15_04_2025;
}