package com.company;

public class Main {

    public static void main(String[] args) {

        Calendar cal = new Calendar();
        cal.Show();
        cal.AddHoliday("One", 1, 6);
        cal.AddHoliday("Two", 7, 13);
        cal.AddHoliday("Three", 15, 16);
        cal.AddHoliday("Four", 64, 88);
        cal.Show();

    }
}