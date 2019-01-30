package modules.HelloWorld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage){

        StackPane rootPane = new StackPane();

        Scene myScene = new Scene(rootPane);

        primaryStage.setScene(myScene);

        primaryStage.setTitle("YouEngineering Teamday");

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
