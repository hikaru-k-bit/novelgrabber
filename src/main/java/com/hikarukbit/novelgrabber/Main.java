package com.hikarukbit.novelgrabber;
import com.hikarukbit.novelgrabber.config.UI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        UI gui = new UI();
        gui.constructUI(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}