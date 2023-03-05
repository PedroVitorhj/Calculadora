/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaController implements Initializable {

    private String calculo = "";
    
    @FXML
    private TextField tbCalculo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void addValoresCalculo(ActionEvent e){
        String num = ((Button)e.getSource()).getText();
        calculo += num;   
        tbCalculo.setText(calculo);
    }
    
    public void limpar(){
        calculo = "";
        tbCalculo.setText(calculo);
    }
    
    public void resultado(){
        Expression calcular = new ExpressionBuilder(calculo).build();
        calculo = " = " + calcular.evaluate();
        tbCalculo.setText(calculo);
        calculo = "";
    }
    
}
