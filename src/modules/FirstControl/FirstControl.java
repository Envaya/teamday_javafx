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

        // Add a button control element

        Scene myScene = new Scene(rootPane);

        primaryStage.setScene(myScene);

        // add the button to your layout

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.setTitle("YouEngineering Teamday");

        // add an action to the button like printing a string

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
