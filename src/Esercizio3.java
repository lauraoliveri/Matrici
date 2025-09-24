import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {

        int[][] m = new int[3][3];

        // popolo la matrice con numeri random
        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                m[i][k] = (int) (Math.random() * 100);
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(m[i][k] + "-"); // trattino per separare le colonne
            }
            System.out.println(); // va a capo ogni volta che finisce una riga
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();
        boolean trovato = false;

        for (int i = 0; i < 3; i++) { // righe
            for (int k = 0; k < 3; k++) { //colonne
                if ( m[i][k] == n){
                    trovato = true;
                    break; // quando lo trova esce dal ciclo così trovato rimane true e non cambia
                }else {
                    trovato = false;
                }
            }
            if(trovato){
               break; // per uscire dal ciclo esterno
            }
        }

        if(trovato){
            System.out.println("Numero trovato");
        }else{
            System.out.println("Numero non trovato");
        }



    }
}

/*
Scrivi un programma che chiede all’utente un numero e verifica se è presente in una matrice 3x3.
 */