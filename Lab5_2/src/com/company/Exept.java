package com.company;

public class Exept extends Exception{

    private final int index;
    public Exept(int ind) {
        super("No same game icon");
        this.index = ind;
    }
    public int getIndex() {
        return index;
    }

}