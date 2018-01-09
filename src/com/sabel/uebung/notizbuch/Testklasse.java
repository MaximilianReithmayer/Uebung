package com.sabel.uebung.notizbuch;

public class Testklasse {
    public static void main(String[] args) {
        System.out.println("Programm gestartet!");
        Notizbuch notizbuch = new Notizbuch();
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.hinzufuegen("BlaBla");
        notizbuch.hinzufuegen("Fangcya");
        notizbuch.hinzufuegen("HOHOHOH");
        notizbuch.zeigeNotiz(2);
        notizbuch.zeigeNotiz(-2);
        notizbuch.zeigeNotiz(23);

;
        System.out.println(notizbuch.anzahlNotizen());
        System.out.println(notizbuch);
        System.out.println("Programm zu ende!");
}
}
