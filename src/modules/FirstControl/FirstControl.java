package modules.FirstControl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstControl extends Application {

    @Override
    public void start(Stage primaryStage){

        StackPane rootPane = new StackPane();
        Button sayHello = new Button("Say Hello");

        Scene myScene = new Scene(rootPane);

        primaryStage.setScene(myScene);

        rootPane.getChildren().add(sayHello);

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.setTitle("YouEngineering Teamday");

        sayHello.setOnAction(event -> System.out.println("Hello World!"));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
