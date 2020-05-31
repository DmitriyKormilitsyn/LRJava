package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exept {


        Scanner scan = new Scanner(System.in);
        char c1, c2;
        c1='0';
        c2='1';
        System.out.println("Input ID");
        String s = scan.nextLine();
        System.out.println("Input game_icon");
        String cs = scan.nextLine();

        try { //Обработка стандартного исключения

            c1 = cs.charAt(0);
            c2 = cs.charAt(1);
            ModelT me_phone = new ModelT(s, c1, c2);
            me_phone.Info();
            me_phone.StartScreen();
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Wrong input!");
        }
    }
}