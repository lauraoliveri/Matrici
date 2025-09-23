//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esercizio1 {
    public static void main(String[] args) {

        int[][] m = new int [3][3];

        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = 4;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(m[i][k] + "-"); // trattino per separare le colonne
            }
            System.out.println(); // va a capo ogni volta che finisce una riga
        }
    }
}

/*
Creazione e stampa di una matrice

Scrivi un programma che dichiara una matrice 3x3 di numeri interi, la riempie con valori a piacere e la stampa.
 */