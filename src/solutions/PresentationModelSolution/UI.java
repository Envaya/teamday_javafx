package solutions.PresentationModelSolution;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.util.converter.NumberStringConverter;

public class UI extends VBox {

    private Label myLabel;
    private TextField age;
    private PM model;

    public UI(PM model) {
        this.model = model;
        initializeSelf();
        initializeControls();
        layoutControls();
        setupEventHandlers();
        setupValueChangedListeners();
        setupBindings();
    }

    private void initializeSelf() {
    }

    private void initializeControls() {
        myLabel = new Label("Alter");
        age = new TextField();
    }

    private void layoutControls() {
        HBox myHBox = new HBox();
        myHBox.getChildren().addAll(myLabel, age);
        getChildren().addAll(myHBox);

    }

    private void setupEventHandlers() {
    }

    private void setupValueChangedListeners() {
    }

    private void setupBindings() {
        age.textProperty().bindBidirectional(model.ageProperty(), new NumberStringConverter());
    }
}
