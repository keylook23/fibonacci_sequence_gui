package com.zacharadamian.fibonaccisequence;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 */
public class ChartView {            //kalsa dpowiadajaca za wysietlenie danych
    public void drawChart(int[] tab){     //metoda rysujaca wykRes
        XYSeries dataSet= new XYSeries("Sequence");  //inicjalizacja datesaet
        int termsSequence; // przypisanie zmiennnej dCiagu wartosci tab.length
        termsSequence = tab.length;
        for (int i=0; i <termsSequence; i+=1){ //petla dodajaca do datasetu kolejne punku wykresu z tablicy tab
            dataSet.add(i,tab[i]);
        }
        XYSeriesCollection xySeriesCollection = new XYSeriesCollection(dataSet);   //tworzenie collekcji tworzaca datast
        XYDataset xyDataSet = xySeriesCollection; 
        JFreeChart lineGraph = ChartFactory.createXYLineChart     
            ( "Wykres Ciągu Fibonacciego",  // Title
            "Wyraz ciągu",           // X-Axis label 
            "Wartość",           // Y-Axis label 
            xyDataSet,          // Dataset 
            PlotOrientation.VERTICAL,        //Plot orientation 
            false,                //show legend 
            false,                // Show tooltips 
            false               //url show 
            );
        ChartFrame frame = new ChartFrame("Wykres Ciągu Fibonacciego", lineGraph); 
        frame.pack(); 
        frame.setVisible(true);     
    }
}