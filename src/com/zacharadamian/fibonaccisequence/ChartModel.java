package com.zacharadamian.fibonaccisequence;

/**
 *
 */
public class ChartModel{ // Klasa modelu
    public int[] calculateSequence(int i){ // Metoda obliczająca kolejnt wyraz ciągu
        int termsSequence[] = new int[i]; // Stworzenie tablicy int
        termsSequence[0] = 1; // 1 wyraz ciągu
        termsSequence[1] = 2; // 2 wyraz ciągu
        for (int n = 2; n < termsSequence.length; n++){ // Pętla for odpowiadająca za inkrementacje kolejnych wyrazów ciągu od 2
            termsSequence[n] = termsSequence[n - 2] + termsSequence[n - 1];// Każdy kolejny wyraz ciągu jest sumą dwóch poprzednich zaczynając od 2 wyrazu 
        }    
    return termsSequence;    // zwrócenie wartości wyrazu ciągu
    }
}
    
    
    
    
   
