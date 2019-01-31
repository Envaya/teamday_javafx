package solutions.BidirectionalBindingSolution;

import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class BidirectionalBindingUI extends VBox {
	private Slider slider;
	private TextField text;


	public BidirectionalBindingUI() {
	    initializeSelf();
		initializeControls();
		layoutControls();
        setupEventHandlers();
        setupValueChangedListeners();
        setupBindings();
	}

    private void initializeSelf(){
        String stylesheet = getClass().getResource("style.css").toExternalForm();
 		getStylesheets().add(stylesheet);
    }

	private void initializeControls() {
		slider = new Slider();
		text = new TextField();
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		setSpacing(5);
		getChildren().addAll(slider, text);
	}

    private void setupValueChangedListeners() {
    }

    private void setupEventHandlers() {
    }

	private void setupBindings(){

		text.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}



}
