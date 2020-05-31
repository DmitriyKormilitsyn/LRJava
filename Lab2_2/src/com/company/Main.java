package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Matrix[][] = new int [n][n];
        int T_Matrix[][] = new int[n][n];
        // Генерируем
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                Matrix[i][j] = - n + (int)(Math.random() * (2 * n + 1));
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Формируем транспонированную матрицу
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                T_Matrix[i][j] = Matrix[j][i];
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(T_Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
