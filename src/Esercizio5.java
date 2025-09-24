public class Esercizio5 {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        // popolo la prima matrice
        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = 2;
            }
        }

        int[][] m2 = new int[3][3];

        // popolo la prima matrice
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                m2[y][x] = 3;
            }
        }

        int somma = 0;

        // creo una nuova matrice dove salvare i risultati della somma
        int[][] m3 = new int[3][3];


        // faccio la somma e aggiungo il risultato alla terza matrice
        for (int r = 0; r < 3; r++) {
            for (int t = 0; t < 3; t++) {
                somma = m[r][t] + m2[r][t]; // somma dei valori nella cella con indice corrispondente
                m3[r][t] = somma; // aggiungo alla terza matrice il risultato
            }
        }



        // stampo la terza matrice

        for (int r = 0; r < 3; r++) {
            for (int t = 0; t < 3; t++) {
                System.out.print(m3[r][t] + "-");
            }
            System.out.println();
        }
    }
}


//Scrivi un programma che somma due matrici 3x3 e memorizza il risultato in una terza matrice.