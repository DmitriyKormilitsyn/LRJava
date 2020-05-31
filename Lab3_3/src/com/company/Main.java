package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House("Some_House", "close");
        h.add_window("Closed");
        h.add_window("Open");
        h.add_window("Open");
        h.add_door("Closed", "Kitchen");
        h.add_door("Closed", "Outside");
        h.add_door("Closed", "Sleep");
        h.show();
        h.lock();
        h.show();
        h.open();
        h.show();
    }
}