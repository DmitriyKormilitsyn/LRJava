package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix M = new Matrix(5, 5, 7);
        M.Show();
        M.Swing(1);
        M.Show();
        M.sqr(2);
        M.Show();
    }
}
