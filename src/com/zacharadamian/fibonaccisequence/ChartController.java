package com.zacharadamian.fibonaccisequence;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChartController implements Initializable{ // klasa obsługująca okno programu
    @FXML private TextField textField; // wywolanie funkcji pola tekstowego 
    @FXML private Label labelStatus; // wywolanie funkcji dla etykiety wyświetlającej w tym wypadku wyjątku
    @FXML private void handleButtonAction(ActionEvent event){    //wywolanie funkckji odpowiadajacej zdazeniu na buttonie
        try{
            int valueTextField = Integer.parseInt(textField.getText());
            ChartModel chartModel = new ChartModel();       //inicjalizacja clasy 
            ChartView viewChart = new ChartView(); //inicjalizacja clasy
            if (valueTextField <46){
                int[] tab = chartModel.calculateSequence(Integer.parseInt(textField.getText())); //przypisanei do zmienniej tablicowej tab wartoci funkcji calculatechartsequence zainicjalizowanej zawartoscia pola tetowego
                viewChart.drawChart(tab);  //wywolanie metody draw chart aby wyswietlic wykres
                labelStatus.setText("Wykres dla " +textField.getText() +" wyrazów ciągu" );
            }
            else{
                labelStatus.setText("Program obsługuje ciąg do 45-ego wyrazu!");
            }
         }
        catch (IndexOutOfBoundsException e){
            System.err.println(e);
            labelStatus.setText("Ciąg musi zawierać przynajmniej 2 wyrazy!");
        }
        catch(NumberFormatException | NegativeArraySizeException e){
            System.err.println(e);
            labelStatus.setText("Podaj liczbę naturalną!");
        }
        finally{
        textField.setText("");
        }
    }
   
    @Override                               //nadpisanie procedury inicjalizujacej zkalsy nadrzednej
    public void initialize(URL location, ResourceBundle resources){}
}
