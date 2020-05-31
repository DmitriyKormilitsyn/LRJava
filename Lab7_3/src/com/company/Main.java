package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        File input = new File("Input.txt");

        try (Scanner scan = new Scanner(input)) {
            String res_big = "";
            while (scan.hasNextLine()) {
                String Line_buff = scan.nextLine();
                String[] sentences = Line_buff.split("[\\!|\\.|\\?]\\s?");
                int p = 0;
                for (String sentence : sentences) {
                    String[] words = sentence.split("[\\s,.:!?()\"—]+");
                    String word1 = words[0];
                    String work2 = words[words.length - 1];
                    int pos = sentence.indexOf(work2);
                    String res = work2 + sentence.substring(word1.length(), pos) + word1;
                    p += res.length();
                    res_big += res + Line_buff.charAt(p) + " ";
                    p += 2;
                }
            }
            System.out.println(res_big);
        }
        catch (FileNotFoundException exp) {
            System.out.println("No file");
        }
    }
}