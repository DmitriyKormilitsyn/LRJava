package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Calendar {

    private List<Holiday> holidays = new ArrayList<Holiday>();
    private char[] map = new char[366]; // w - раб день, h - вых

    public Calendar() {
        for (int i = 0; i < 366; i++) {
            if (i % 6 == 0) //Сб = выходной.
            {
                map[i] = 'h';

            } else {
                map[i] = 'w';
            }
        }
    }

    public class Holiday {

        private String name;
        private int date_strt;
        private int date_end;

        public Holiday(String Holi_name, int day_start, int day_end) {

            this.name = Holi_name;
            this.date_end = day_end;
            this.date_strt = day_start;

        }

    }

    public void AddHoliday(String Holi_name, int day_start, int day_end) {
        try {
            Holiday h = new Holiday(Holi_name, day_start, day_end);
            holidays.add(h);
            for (int i = day_start; i < day_end; i++) {

                map[i] = 'h';

            }
        }catch (InputMismatchException e1) {
            System.out.println("Error input");
        }

    }

    public void Show() {

        System.out.println(map);

    }

    public void GetTypeDay(int i) { //Выводит тип дня (выходной или рабочий)
        try {
            System.out.println(map[i]);
        } catch (IndexOutOfBoundsException  e1) {
            System.out.println("Error, out of range ");
        }
    }

}

