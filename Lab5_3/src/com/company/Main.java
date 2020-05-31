package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("input.txt");

        try (Scanner scan = new Scanner(input)) {
            int max = 0;
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                System.out.println(s);
                int tmp = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        tmp++;
                    }
                    else {
                        if (tmp > max) max = tmp;
                        tmp = 0;
                    }
                }
                if (tmp > max) max = tmp;
                tmp=0;
            }
            System.out.println("Max: " + max);

        }
        catch (FileNotFoundException exp) {
            System.out.println("No_File");
        }
    }
}