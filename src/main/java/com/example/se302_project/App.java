package com.example.se302_project;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("SMSMainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        String path = "images/paintedLogo.png";
        Image image = new Image(getClass().getResource(path).toExternalForm());
        stage.getIcons().add(image);
        stage.setTitle("Syllabus Management System");
        stage.setMinHeight(800);
        stage.setMinWidth(1300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}