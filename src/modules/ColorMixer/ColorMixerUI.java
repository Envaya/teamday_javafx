package modules.ColorMixer;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Rectangle;

public class ColorMixerUI extends GridPane {
    // define the necessary controls

    // the rectangles displays the color
    private Rectangle display;

    //write the constructor for UI class

    private void initializeSelf() {
        String stylesheet = getClass().getResource("style.css").toExternalForm();
        getStylesheets().add(stylesheet);
    }

    private void initializeControls() {

        // initialize the controls
        display = new Rectangle();
    }

    private void layoutControls() {
        setPadding(new Insets(10));
        setHgap(10);
        setVgap(10);

        // use the grid to place the control elements

        setPrefHeight(getPrefHeight() + 200);
    }

    private void setupEventHandlers() {
    }

    private void setupValueChangedListeners() {
    }

    private void setupBindings() {

        // setup the bindings to control the colors

        // bind the color of the display fill to color of the PM: display.fillProperty(..

        display.setWidth(200);
        display.setHeight(100);

    }
}
