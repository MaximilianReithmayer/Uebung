package com.sabel.uebung.notizbuch;

import java.util.ArrayList;
public class Notizbuch {
    private ArrayList<String> notizen;

    public Notizbuch() {
        notizen = new ArrayList<>();
    }

    public void hinzufuegen(String notiz){
        notizen.add(notiz);
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < anzahlNotizen();
    }

    public int anzahlNotizen(){
        return notizen.size();
    }

    public String loeschen(int index){
        if (checkIndex(index)){
            String zuloeschendeNotiz = notizen.get(index);
            notizen.remove(index);
            return zuloeschendeNotiz;
        }
        return null;
    }

    public void zeigeNotiz(int index){
        if (checkIndex(index)){
            String notiz = notizen.get(index);
            System.out.println(notiz);
            return;
        }
        System.out.println("Index ungültig!");
    }

    public void alleNotizenanzeigen(){
        for(String notiz:notizen){
            System.out.println(notiz);
        }
    }

    public String toString() {
        String result = "Notizbuch:\n";
        for (String notiz : notizen){
            result = result + notiz + "\n";
        }
        return result;
    }
}
