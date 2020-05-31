package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int [n];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = scan.nextInt();
        }

        for (int i = 0; i < ar.length - 1; i++)
        {
            for (int j = 0; j < ar.length - i - 1; j++)
            {
                if (Math.abs(ar[j]) > Math.abs(ar[j+1]))
                {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
