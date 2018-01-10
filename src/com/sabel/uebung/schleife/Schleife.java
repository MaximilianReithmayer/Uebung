package com.sabel.uebung.schleife;

public class Schleife {
    public int summieren(int a, int b){
        int zaehler = a;
        int summe = 0;
        while(zaehler <= b){
            summe += zaehler;
            zaehler++;
        }
        return summe;
    }

    public static void main(String[] args) {
        Schleife schleifen = new Schleife();
        int summe = schleifen.summieren(1, 10);
        System.out.println(summe);
        int zahl = 0;
        while (zahl < 5){
            System.out.println(zahl);
            zahl++;
        }
        System.out.println("Wert von zahl nach der Schleife: " + zahl);

        //Aufgabe 2: Ausgabe aller vielfachen von 5 von 20 bis 100,
        int count = 0;
        zahl = 20;
        while(zahl < 101){
            System.out.println(zahl);
            zahl += 5;
            count++;
        }

        System.out.println("Die Schleife wurde " + count + " mal durchlaufen");

        // Aufgabe 3: Alle ungeraden zahlen zwischen 3 und 250

        zahl = 3;
        while(zahl < 250){
            if (zahl % 2 == 1){
                System.out.println(zahl);
            }
            zahl++;
        }


    }
}
