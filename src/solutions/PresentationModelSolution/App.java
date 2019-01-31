package solutions.PresentationModelSolution;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		PM pm = new PM(22);

		Parent rootPanel = new UI(pm);

		Scene scene = new Scene(rootPanel);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Presentation Model");

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
