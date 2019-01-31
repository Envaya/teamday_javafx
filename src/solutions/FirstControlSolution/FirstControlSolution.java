package solutions.FirstControlSolution;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstControlSolution extends Application {

    @Override
    public void start(Stage primaryStage){

        StackPane rootPane = new StackPane();
        // add a button control element
        Button sayHello = new Button("Say Hello");

        Scene myScene = new Scene(rootPane);

        primaryStage.setScene(myScene);

        // add the button to your layout
        rootPane.getChildren().add(sayHello);

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.setTitle("YouEngineering Teamday");

        // add an action to the button like printing a string
        sayHello.setOnAction(event -> System.out.println("Hello World!"));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
