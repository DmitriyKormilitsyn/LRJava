package com.company;

public class ModelT extends SiemensMob{

    private String model_name;
    private char Game_icon1, Game_icon2;
    private int memory;


    @Override
    public void Info() {
        System.out.println(company + ' ' + model_name);
        System.out.print("Game_icon 1: ");
        System.out.println(Game_icon1);
        System.out.print("Game_icon 2: ");
        System.out.println(Game_icon2);

    }

    public ModelT(String s, char c1, char c2) throws  Exept{
        model_name = s;
        Game_icon1 = c1;
        Game_icon2 = c2;
        if (c1==c2) {
            throw new Exept(1);
        }

    }

}