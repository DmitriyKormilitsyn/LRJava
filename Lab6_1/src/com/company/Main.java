package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> Array1 = new ArrayList<Integer>();
        ArrayList<Integer> Array2 = new ArrayList<Integer>();
        ArrayList<Integer> ResultArray= new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter power:");
        int Power = scan.nextInt();
        System.out.println("Enter the first polynomial:");
        for (int i = 0; i < Power + 1; i++) {
            int buf = scan.nextInt();
            Array1.add(buf);
        }
        System.out.println("Enter the second polynomial:");
        for (int i = 0; i < Power + 1; i++) {
            int buf = scan.nextInt();
            Array2.add(buf);
        }
        for (int i=0; i<Power*2+1;i++)
            ResultArray.add(0);
        int pow_tmp = Power;
        boolean Start_flag=false;
        for (int i = 0; i < Power+1; i++) {
            if (Array1.get(i)!=0)
            {
                if (Array1.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(Array1.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }

        System.out.println();
        System.out.println("*");
        pow_tmp = Power;
        Start_flag=false;

        for (int i = 0; i < Power+1; i++) {
            if (Array2.get(i)!=0)
            {
                if (Array2.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(Array2.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }
        System.out.println();
        System.out.println("=");
        Start_flag=false;
        //Умножаем
        for (int i = 0; i < Power + 1; i++) {
            for (int j = 0; j < Power + 1; j++) {
                int buf = Array1.get(i)*Array2.get(j);
                ResultArray.set(i+j,ResultArray.get(i+j)+buf);
            }
        }
        pow_tmp=Power*2;
        for (int i = 0; i < Power*2+1; i++) {
            if (ResultArray.get(i)!=0)
            {
                if (ResultArray.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(ResultArray.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }


    }
}