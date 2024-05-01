module com.skull.spark {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.skull.spark to javafx.fxml;
    exports com.skull.spark;
}