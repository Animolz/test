module com.lhn.englishdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.lhn.englishdb to javafx.fxml;
    exports com.lhn.englishdb;
}
