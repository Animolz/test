package com.mycompany.test1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {
    @FXML private TextField heightTxt;
    @FXML private TextField weightTxt;
    @FXML private Label bmi;
    private double height = Double.parseDouble(heightTxt.getText());
    private double weight = Double.parseDouble(weightTxt.getText());
    private double bmiResult;
    
    public void bmiHandler(ActionEvent event){
        bmiResult = weight / (Math.pow(height, 2));
        
        if(bmiResult < 18.5)
            bmi.setText("Gay");
        else if(bmiResult < 25)
            bmi.setText("Binh thuong");
        else{
            bmi.setTextFill(Color.RED);
            bmi.setText("Thua can");
        }
    }
}
