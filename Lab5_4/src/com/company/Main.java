package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File input = new File("input.txt");
        Scanner scan_ = new Scanner(System.in);
        System.out.println("Enter the desired type:");
        String type = scan_.nextLine();

        File dir = new File("outputs");
        Boolean dir_cr = dir.mkdirs();
        String path = "outputs\\output_" + type + ".txt";
        File output = new File(path);
        try {
            FileWriter myWriter = new FileWriter(path);

            try (Scanner scan_line = new Scanner(input)) {

                while (scan_line.hasNextLine()) {
                    String scan_letter = scan_line.nextLine();

                    // Определяем тип
                    String type_of_line = "Int";
                    for (int i = 0; i < scan_letter.length(); i++) {
                        if (scan_letter.charAt(i) == '.' && type_of_line.equals("Int")) {
                            type_of_line = "Float";
                        }
                        if (!Character.isDigit(scan_letter.charAt(i)) && scan_letter.charAt(i) != '.') {
                            type_of_line = "String";
                        }
                    }
                    if (type_of_line.equals("String") && scan_letter.length() == 1) {
                        type_of_line = "Char";
                    }
                    if (type_of_line.equals(type)) {
                        myWriter.write(scan_letter+'\r'+'\n');
                    }
                }
            }
            catch (FileNotFoundException exp) {
                System.out.println("Np input file");
            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("No output file");
        }
    }
}