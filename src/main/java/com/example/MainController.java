/*
* File: SolutionController.java
* Author: Viola Máté
* Copyright: 2025, Viola Máté
* Group: II/2/N
* Date: 2025-02-10
* Github: https://github.com/matukav
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField solField;
    
    private ArrayList<Henger> resultList = new ArrayList<>();
    
    @FXML
    void onClickSolutionButton(ActionEvent event) {
        String lengthStr = this.lengthField.getText();
        double length = Double.parseDouble(lengthStr);
        String radiusStr = this.radiusField.getText();
        double radius = Double.parseDouble(radiusStr);

        double surface = calcSurface(length, radius);

        String surfaceStr = Double.toString(surface);
        this.solField.setText(surfaceStr);
        Henger henger = new Henger(radius, length, surface);
        resultList.add(henger);
        saveToFile(henger);
    }

    private Double calcSurface(double length, double radius) {
        return 2 * Math.PI * radius * (radius + length);
    }
    
    private void saveToFile(Henger henger) {
        try {
            FileWriter fw = new FileWriter("henger.txt", true);
            String line = String.format("Sugár: %.2f cm, Hossz: %.2f cm, Felszin: %.2f cm²%n", 
                    henger.getRadius(), henger.getLength(), henger.getSurface());
            fw.write(line);
            fw.close();
            
        } catch (IOException e) {
            System.err.println("Hiba a fájl mentésekor: " + e.getMessage());
        }
    }
}