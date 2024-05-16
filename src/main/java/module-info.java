module com.tubes.kalkulasizakat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.tubes.kalkulasizakat to javafx.fxml;
    exports com.tubes.kalkulasizakat;
}