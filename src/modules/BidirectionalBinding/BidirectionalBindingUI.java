package modules.BidirectionalBinding;

import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class BidirectionalBindingUI extends VBox {

	// create a slider and a textfield control element

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
		// initialize the controls
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		setSpacing(5);
		// add all controls to your layout
	}

    private void setupValueChangedListeners() {
    }

    private void setupEventHandlers() {
    }

	private void setupBindings(){
		// create a binding so that whenever the slider value changes, the text changes accordingly
		// and the other way around
	}



}
