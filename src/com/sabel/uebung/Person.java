package com.sabel.uebung;

public class Person {
    private String name;
    private int alter;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int alter) {
        this.name = name;
        this.setAlter(alter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter < 0){
            System.out.println("Alter darf nicht negativ sein");
            System.out.println("Bitte positives Alter angeben");
            return;
        }
        this.alter = alter;
    }

    public void druckeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
    }

    public String toString(){
        String result = "Name: " + name + "\nAlter: " + alter;
        return result;
    }

}
