package com.hikarukbit.novelgrabber;

import com.hikarukbit.novelgrabber.config.UI;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        UI gui = new UI();
        gui.constructUI(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}