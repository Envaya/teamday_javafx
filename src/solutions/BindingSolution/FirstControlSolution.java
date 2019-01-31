package solutions.BindingSolution;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstControlSolution extends Application {

    @Override
    public void start(Stage primaryStage){

        StackPane rootPane = new StackPane();
        // add a button control element
        Button sayHello = new Button("Say Hello");

        TextField t1 = new TextField();
        Slider s1 = new Slider();

        Scene myScene = new Scene(rootPane);

        primaryStage.setScene(myScene);

        VBox v = new VBox();

        // add the button to your layout
        rootPane.getChildren().add(sayHello);

        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.setTitle("YouEngineering Teamday");

        // add an action to the button like printing a string
        sayHello.setOnAction(event -> System.out.println("Hello World!"));

        t1.textProperty().bind(s1.valueProperty().asString());

        v.getChildren().addAll(t1,s1);

        rootPane.getChildren().add(v);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
