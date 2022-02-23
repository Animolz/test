package com.mycompany.test1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    public void Controller(ActionEvent event){
<<<<<<< HEAD
    int a = 10;
    int b = 20;
=======
    int a = 100;
    int b = 200;
>>>>>>> main
    int c = a + b;
    }
}
