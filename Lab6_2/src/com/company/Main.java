package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("Input.txt");
        ArrayList<Integer> Array_1 = new ArrayList<Integer>();
        ArrayList<Integer> Array_2 = new ArrayList<Integer>();
        boolean flag=true;
        try (Scanner Num_scan = new Scanner(input)) {

            while (Num_scan.hasNextLine()) {

                String buf = Num_scan.nextLine();
                String[] buf_ = buf.split(" ");
                for (int i = 0; i < buf_.length; i++) {
                    if (flag==true) {
                        if (Integer.parseInt(buf_[i])>0) {
                            int int_ = Integer.parseInt(buf_[i]);
                            Array_1.add(int_);
                        }
                        else{ flag=false;}
                    }
                    else {
                        int int_ = Integer.parseInt(buf_[i]);
                        Array_2.add(int_);
                    }
                }
            }
        }
        catch (FileNotFoundException exp) {
                System.out.println("No such file found!");
            }

        Collections.sort(Array_1);
        Collections.sort(Array_2);
        System.out.println("Sorted array 1: " + Array_1);
        System.out.println("Sorted array 2: " + Array_2);
        Array_1.addAll(Array_2);
        Collections.sort(Array_1);
        System.out.println("Sorted all: " + Array_1);

    }
}