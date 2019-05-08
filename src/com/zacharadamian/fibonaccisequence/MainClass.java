package com.zacharadamian.fibonaccisequence;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {             //icjalizacja programu
    public static void main(String[] args) { 
        launch(args);
    }  
    @Override
    public void start(Stage stage) throws Exception{           ////To change body of generated methods, choose Tools | Templates.
        Parent root = FXMLLoader.load(getClass().getResource("FXMLChart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("fibonacci_sequence_gui");
    }
}


/* w wersji cmd dodajesz obsługe args{] x fnkcji main -

jezezli args[0] jest puste to uruchamiasz fibbonacji gui - nap przez odpiiednik dosowego exec
jsezli jest liczba przekazujesz ja do funkcji rysuj , jezeli jest cos inego wysiwetlasz pomoc .. przez wypisanie tekstu na standartowe wyjscie */