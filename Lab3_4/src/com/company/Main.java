package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book books[] = new Book[5];
        books[0] = new Book("Dict", 1000);
        books[1] = new Book("Repick", 200);
        books[2] = new Book("Set", 300);
        books[3] = new Book("Doka1", 610);
        books[4] = new Book("Doka2", 593);
        Customer customers[] = new Customer[5];
        Order orders[] = new Order[10];

        //Работа с вводом
        System.out.println("Enter your name");
        String name = scan.nextLine();
        customers[4] = new Customer(name); //Создаем пользователя
        customers[4].Show();
        String t;
        int i = 0; //id заказов
        while (true) {
            System.out.println("enter");
            System.out.println("o - to send an order");
            System.out.println("s - to show your stats");
            System.out.println("p - to pass the day");
            System.out.println("c - to close an order");
            System.out.println("q - to quit");
            t = scan.nextLine();
            if (t.equals("q")) {
                break;
            }
            if (t.equals("o")) {
                if (customers[4].getInBlacklist() < 0) {
                    System.out.println("YOU ARE BLACKLISTED!"); //нельзя взять книгу, если в черном списке
                    break;
                }
                System.out.println("What is the book in question?");
                System.out.println("'-help' to see all books");
                String bname = scan.nextLine();
                int ds;
                int bk = -1;
                if (bname.equals("-help"))
                {
                    for (int j = 0; j < books.length; j++) {
                        System.out.println(books[j].getName());
                    }
                    System.out.println("What is the book in question?");
                    bname = scan.nextLine();
                }
                for (int j = 0; j < books.length; j++) { //Ищем книгу в каталоге
                    if (books[j].getName().equals(bname)) {
                        bk = j;
                    }
                }
                if (bk > -1) { //Узнаем, как долго держим книгу. Если день - читзал, больше - абонемент
                    if (books[bk].getState().equals("On Storage"))
                    {
                        System.out.println("For how long shall you keep it?");
                        ds = scan.nextInt();
                        orders[i] = new Order(customers[4], books[bk], ds); //Заказ создан
                        System.out.println("Posted an order with id = " + i);
                        i++;
                    }
                    else{
                        System.out.println("Taken");
                    }
                }
                else { //Не нашли книгу
                    System.out.println("No Book");
                }

            }
            if (t.equals("s")) { //Инфа юзера
                customers[4].Show();
            }
            if (t.equals("c")) { //Закрытие заказа - возврат книги
                System.out.println("Type in an id of the order you want closed");
                System.out.println("'-1' to see all your orders id and days you have to return");
                int id = scan.nextInt();
                if (id == -1){
                    for (int j = 0; j < i; j++){
                        if(orders[j].getName().equals(customers[4].getName())){
                            System.out.println("Order "+j+" You have: "+orders[j].getDays()+" Days for this book:"+orders[j].getBook());
                        }
                    }
                    System.out.println("Type in an id of the order you want closed");
                    id = scan.nextInt();
                }
                orders[id].Close();
            }
            if (t.equals("p")) {
                for (int j = 0; j < i; j++) { //Всем заказам сообщаем, что день прошел
                    orders[j].DayPassed();
                }
            }
        }
    }
}