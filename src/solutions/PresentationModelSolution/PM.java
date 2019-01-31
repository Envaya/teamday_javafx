package solutions.PresentationModelSolution;

import javafx.beans.binding.Bindings;
import javafx.beans.property.*;

/**
 * @author Dieter Holz
 */
public class PM {
	private final StringProperty applicationTitle = new SimpleStringProperty("Color Mixer");

	private final IntegerProperty age   = new SimpleIntegerProperty(5);

	public PM(int age) {
		setAge(age);
	}

	public PM() {
	}

	public String getApplicationTitle() {
		return applicationTitle.get();
	}

	public StringProperty applicationTitleProperty() {
		return applicationTitle;
	}

	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle.set(applicationTitle);
	}

	public int getAge() {
		return age.get();
	}

	public IntegerProperty ageProperty() {
		return age;
	}

	public void setAge(int age) {
		this.age.set(age);
	}

}
