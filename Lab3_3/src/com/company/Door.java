package com.company;

public class Door {
    private String state; // open, closed, locked
    private String title;

    public String getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    Door(String s, String t) {
        this.state=s;
        this.title=t;
    }

    public void open(){
        this.state="open";
    }

    public void close(){
        this.state="closed";
    }

    public void lock() {
        this.state="closed by key";
    }
}