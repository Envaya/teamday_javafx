package sample.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class UI extends VBox {
    private Slider s1;
    private Label sliderValueLabel;
    private TextField sliderValueText;

    public UI() {
        s1 = new Slider();
        sliderValueLabel = new Label("Slider Value");
        sliderValueText = new TextField();

        sliderValueText.textProperty().bind(s1.valueProperty().asString());
        setPadding(new Insets(10));
        getChildren().addAll(s1, sliderValueLabel, sliderValueText);
    }
}
