module se233.chapter5_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se233.chapter5_1 to javafx.fxml;
    exports se233.chapter5_1;
}