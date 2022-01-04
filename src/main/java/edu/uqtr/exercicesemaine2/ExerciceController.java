package edu.uqtr.exercicesemaine2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ExerciceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}