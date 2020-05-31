
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();
        cal.Show();
        System.out.println("Add new Holidays:");
        System.out.println("HolidayName:");
        String holi_name = scan.nextLine();
        int start_holi = 0, end_holi = 0;
        try {
            System.out.println("Start:");
            start_holi = scan.nextInt();
            System.out.println("End:");
            end_holi = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Error input");
        }

        try {
            cal.AddHoliday(holi_name, start_holi, end_holi);
        } catch (IndexOutOfBoundsException  e1) {
            System.out.println("Error, out of range");
        }
        cal.Show();
        int k = 0;

        System.out.println("Get type of day:");
        try {
            k = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Error input");
        }
        cal.GetTypeDay(k);

    }
}