package modules.ColorMixer;

import javafx.application.Application;
import javafx.stage.Stage;

public class ColorMixerApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ColorMixerPM pm = new ColorMixerPM();

		//set the colormixer ui as the root panel

		// create a new scene and pass it the root panel

		primaryStage.titleProperty().bind(pm.applicationTitleProperty());

		//set the scene

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
