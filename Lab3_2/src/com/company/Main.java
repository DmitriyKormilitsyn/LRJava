package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book(0,"Start", new String[]{"Ask", "This"}, "Nice", 2013, 123, 111, "hard");
        books[1] = new Book(1,"Mid", new String[]{"Ask"}, "Drill", 1980, 533, 1230, "soft");
        books[2] = new Book(2,"End", new String[]{"Pil"}, "Bro", 2015, 1123, 1220, "hard");

        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine(); //Поиск по автору
        for (int i = 0; i < books.length; i++){ //
            for (int j = 0; j < books[i].getAuthor().length; j++){
                if (books[i].getAuthor()[j].equals(author)) {
                    System.out.println(books[i]);
                }
            }
        }
        System.out.println();

        int year = scan.nextInt(); //Поиск по году
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getYear() > year) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
        String publisher = scan.nextLine(); //Поиск по издательству
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();



    }
}
