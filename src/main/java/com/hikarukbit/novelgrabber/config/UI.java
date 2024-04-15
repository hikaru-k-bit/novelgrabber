package com.hikarukbit.novelgrabber.config;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UI {
    public void constructUI(Stage stage) {
        // Создание корневого элемента
        VBox root = new VBox();
        root.setMinWidth(600);
        root.setMinHeight(400);
        root.setMaxWidth(1200);
        root.setMaxHeight(800);
        root.setPrefWidth(1200);
        root.setPrefHeight(800);

        // Создание контейнера для вкладок
        TabPane tabPane = new TabPane();
        tabPane.setPrefWidth(200);
        tabPane.setPrefHeight(200);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        VBox.setVgrow(tabPane, javafx.scene.layout.Priority.ALWAYS);

        // Создание самих вкладок.
        Tab automaticTab = new Tab("Automatic");
        Tab manualTab = new Tab("Manual");
        Tab libraryTab = new Tab("Library");
        Tab settingsTab = new Tab("Settings");

        // Добавление содержимого в созданные вкладки.
        automaticTab.setContent(createAutomaticContent());
        manualTab.setContent(new AnchorPane());
        libraryTab.setContent(new AnchorPane());
        settingsTab.setContent(new AnchorPane());

        // Добавление вкладок в контейнер.
        tabPane.getTabs().addAll(automaticTab, manualTab, libraryTab, settingsTab);

        // Подключение контейнера к корневому элементу.
        root.getChildren().add(tabPane);

        /*
        Создание сцены со следующими параметрами:
        1. Включает в себя корневой элемент root.
        2. Имеет разрешение 1200х800.
         */
        Scene scene = new Scene(root, 1200, 800);

        /*
        Настройка сцены:
        1. Название окна.
        2. Указатель на scene.
        3. Отключение возможности изменять размер окна во избежание багов.
         */
        stage.setTitle("Novel Grabber by hikarukbit; inspired by Flameish (v: 1.0.0)");
        stage.setScene(scene);
        stage.setResizable(false);

        // Showing the Stage
        stage.show();
    }

    private AnchorPane createAutomaticContent() {
        AnchorPane automaticContent = new AnchorPane();
        automaticContent.setPrefWidth(200);
        automaticContent.setPrefHeight(180);

        HBox hbox = new HBox();
        hbox.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hbox.setPrefWidth(694);
        hbox.setPrefHeight(100);
        hbox.setStyle("-fx-border-color: #f4cc94; -fx-border-width: 5px;");

        Label label = new Label("Novel URL");
        TextField textField = new TextField();

        HBox.setMargin(label, new Insets(0, 0, 0, 10));
        HBox.setMargin(textField, new Insets(0, 0, 0, 10));

        hbox.getChildren().addAll(label, textField);

        AnchorPane.setTopAnchor(hbox, 27.0);
        AnchorPane.setLeftAnchor(hbox, 25.0);

        automaticContent.getChildren().add(hbox);

        return automaticContent;
    }

}