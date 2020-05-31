package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < args.length; i++) {
            n += Integer.parseInt(args[i]);
        }
        System.out.println("sum: " + n);
    }
};