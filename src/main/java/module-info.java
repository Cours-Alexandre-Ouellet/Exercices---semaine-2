module edu.uqtr.exercicesemaine2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.uqtr.exercicesemaine2 to javafx.fxml;
    exports edu.uqtr.exercicesemaine2;
}