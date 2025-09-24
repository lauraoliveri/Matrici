public class Esercizio4 {
    public static void main(String[] args) {

        int[][] m = new int[4][4];

        // popolo la matrice con numeri random
        for (int i = 0; i < 4; i++) { // righe
            for (int k = 0; k < 4; k++) { //colonne
                if (m[i] == m[k]) { // se il numero di riga e colonna coincidono stampa uno
                    m[i][k] = 1;
                } else {
                    m[i][k] = 0;
                }
            }
        }

        // stampa la matrice
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(m[i][k] + "-"); // trattino per separare le colonne
            }
            System.out.println(); // va a capo ogni volta che finisce una riga
        }
    }
}
