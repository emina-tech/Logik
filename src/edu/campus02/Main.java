package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;

        System.out.println("Die Sonne scheint UND es regnet: " + ergebnis);

        // Das Beispiel verwirrt mich ODER Ich kenne mich aus

        boolean ichBinVerwirrt;
        boolean ichKenneMichAus;

        ichBinVerwirrt = true;
        ichKenneMichAus = false;

        boolean zweiteergebnis;
        zweiteergebnis = ichBinVerwirrt || ichKenneMichAus;

        System.out.println("Das Beispiel verwirrt mich ODER Ich kenne mich aus: " + zweiteergebnis);

        // Bsp 3: (1 > 3 UND (NICHT 3-1 < 5)) ODER 2 == 4*4
        //        (1 > 3 && (! (3-1 < 5)) || 2 == 4*4

        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil2 = 2 == 4*4;
        teil1 = 1 > 3 && !(3-1 < 5);

        ergebnis3 = teil1 || teil2;
        System.out.println("Ergebnis 3: " + ergebnis3);

        // Bsp 4: (6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1!= 1+1)

        boolean teilA;
        boolean teilB;
        boolean ergebnis4;

        teilA = (6 >= 2*3 || 2-3 < 0);
        teilB = (1*1 == 1 && 1!= 1+1);

        ergebnis4 = teilA && teilB;
        System.out.println("Ergebnis 4: " + ergebnis4);

    }

}
