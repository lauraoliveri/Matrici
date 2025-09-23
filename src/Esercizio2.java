public class Esercizio2 {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        // popolo la matrice con numeri random
        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = (int)(Math.random() * 100);
            }
        }

        int somma = 0;

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                somma = somma + m[i][k];
                System.out.print(m[i][k] + "-"); // trattino per separare le colonne
            }
            System.out.println(); // va a capo ogni volta che finisce una riga
        }

        System.out.println("La somma di tutti i valori è " + somma);

    }
}
