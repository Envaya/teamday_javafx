package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.view.UI;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Button button = new Button("Click me");
        StackPane rootPane = new StackPane();
        UI myUI = new UI();

        rootPane.getChildren().add(myUI);

        Scene myScene = new Scene(rootPane);

        primaryStage.setTitle("YouEngineering Teamday");
        primaryStage.setScene(myScene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
