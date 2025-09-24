import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        // popolo la matrice
        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = 2;
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = m[i][k] * n;
                System.out.print(m[i][k] + "-");
            }
            System.out.println();
        }
    }
}

// Scrivi un programma che moltiplica tutti gli elementi di una matrice 3x3 per un numero dato dall’utente.