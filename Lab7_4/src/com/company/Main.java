package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File input = new File("Input.txt");
        String Res="";
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String Line_buffer = scan.nextLine();
                for (int i=0; i<Line_buffer.length()-2; i++)
                {
                    if (Line_buffer.charAt(i)!=Line_buffer.charAt(i+1))
                    {
                        Res+=Line_buffer.charAt(i);
                    }
                }
                Res+=Line_buffer.charAt(Line_buffer.length()-1);
                Res+="\n\r";
            }
            System.out.println(Res);
        }
        catch (FileNotFoundException exp) {
            System.out.println("No file");
        }
    }
}