package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int vc_big = 0;
        int tt_big = 0;
        String LatAlphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String Glasnie = "eyuioaEYUIOA";
        String Soglasnie = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
        char let[] = LatAlphabet.toCharArray();
        char glas_let[] = Glasnie.toCharArray();
        char sglas_let[] = Soglasnie.toCharArray();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String words[] = str.split(" ");
        int num_p=0;
        int num_s=0;
        for (int i = 0; i < words.length; i++) //Проход по каждому слову
        {
            char let_tmp[] = words[i].toCharArray();
            int tt = 0;
            int sg = 0;
            int g = 0;
            int t = 0;
            for (int j = 0; j < let_tmp.length; j++) //проход по каждой букве
            {


                for (int k = 0; k < let.length; k++) //проверка есть ли латинские буквы
                {
                    if (let[k] == let_tmp[j]) {
                        t += 1;
                    }
                }
                // считаем гласные
                for (int k = 0; k < glas_let.length; k++) {
                    if (glas_let[k] == let_tmp[j]) {
                        g += 1;
                    }
                }
                //считаем согласные
                for (int k = 0; k < sglas_let.length; k++) {
                    if (sglas_let[k] == let_tmp[j]) {
                        sg += 1;
                    }
                }

            }
            if (g==sg)
            {
                num_p+=1;
            }
            if (t==let_tmp.length)
            {
                num_s+=1;
            }
        }


        System.out.println("Latin: " +  num_s + "; sogl=glas " + num_p);
    }
}
