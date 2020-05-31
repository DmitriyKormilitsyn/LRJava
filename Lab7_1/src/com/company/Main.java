package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String Start_String = scan.nextLine();
        System.out.println("Enter the substring:");
        String Sub_String = scan.nextLine();
        System.out.println("Enter the position:");
        int k = scan.nextInt();
        String Result = Start_String.substring(0, k) + Sub_String + Start_String.substring(k, Start_String.length());
        System.out.println(Result);
    }
}