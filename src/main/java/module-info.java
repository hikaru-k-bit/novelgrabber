module com.hikarukbit.novelgrabber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.hikarukbit.novelgrabber to javafx.fxml;
    exports com.hikarukbit.novelgrabber;
}