import java.util.Scanner;

public class C7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Σεταρω 4 πινακες.
        // εναν για τους παιχτες
        String[] players = new String[4];
        // εναν για τα σκορ τους
        // ο πινακας 2d 4 παιχτες 3 εκαστως
        int[][] scores = new int[4][3];
        // εναν για τα συνολα των σκορ του καθενος
        int[] totals = new int[4];
        //και εναν για τον μεσο ορο του καθενος
        double[] average = new double[4];


        // κανω επαναληψεις για να τους γεμησω
        for (int i = 0; i < 4; i++) {
            System.out.println("Give the name of player " + (i+1));
            players[i] = input.next();
            // καθε παικτης δινει και τα 3 game του
            //και κανω αν συνολο της πρωτης θεσης του total
            for (int j = 0; j<3; j++) {
                System.out.println("Give the player's score for game " + (j+1));
                scores[i][j] = input.nextInt();
                totals[i] = totals[i] + scores[i][j];
            }
            // αφου κανω το συνολο βγαζω μεσο ορο του παικτη
            average[i] = totals[i] / 3;
        }

        // σεταρω φορματ εκτυπωσης και κανω print
        System.out.println("\nName  Game 1  Game 2  Game 3  Total   Average");
        System.out.println("-----------------------------------------------");
        for (int  i = 0; i < 4; i++) {
            System.out.println(players[i] + "  " + scores[i][0] + "  " + scores[i][1] + "  " + scores[i][2] + "  " + totals[i] + "  " + average[i]);
        }

    }
}



