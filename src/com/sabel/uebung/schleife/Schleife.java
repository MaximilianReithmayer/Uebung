package com.sabel.uebung.Schleife;

public class Schleife {
    //Aufgabe 4: Summieren von allen Werten zwischen a und b, inklusive a und b
    //Klassenmethode (statische Methode), nicht an ein Obejekt gebunden. Zusatz "static"
    //Aufruf: Klassenname.Methodenname
    public static int summieren(int a, int b) {
        int zaehler = a;
        int summe = 0;
        while (zaehler <= b) {
            summe += zaehler;
            zaehler++;
        }
        return summe;
    }

    // Aufgabe 5: Erkenne ob Wert n eine Primzahl ist
    public static boolean isPrim(int n) {
        int teiler = 2;
        while (teiler < n) {
            if (n % teiler == 0) {  // teilt der Teiler die Zahl n ohne Rest, wenn ja, keine Primzahl
                return false;
            }
            teiler++;
        }
        // Wenn alle Teiler "getestet", dann ist n eine Primzahl
        return true;
    }

    public static void main(String[] args) {

        // Methode summieren (Aufgabe 4) aufrufen
        int summe = summieren(1, 10);
        System.out.println(summe + "\n");

        // Methode isPrim (Aufgabe 5) aufrufen. Ist 127 eine Primzahl.
        if (isPrim(54645)) {
            System.out.println("Ist Primzahl");
        } else {
            System.out.println("Ist keine Primzahl");
        }


        //Aufgabe 1: Ausgabe der Zahlen von 0 bis 4
        int zahl = 0;
        while (zahl < 5) {
            System.out.println(zahl);
            zahl++;
        }
        System.out.println("Wert von zahl nach der Schleife: " + zahl);

        // Aufgabe 2: Ausgabe aller Vielfachen von Fünf von 20 bis 100 jeweils einschließlich
        zahl = 20;
        int count = 0;
        while (zahl < 101) {
            System.out.println(zahl);
            zahl += 5;
            count++;
        }
        System.out.println("Die Schleife wurde " + count + " mal durchlaufen");

        // Aufgabe 3: Ausgabe aller ungeraden Zahlen zwischen 3 und 250
        zahl = 3;
        while (zahl < 250) {
            if (zahl % 2 != 0) {
                System.out.println(zahl);
            }
            zahl++;
        }
    }
}


