package com.company;

public class Matrix {
    private int [][] Mtrx;
    public Matrix(int [][] n){ //Конструктор с передачей массива
        this.Mtrx = n;
    }
    public Matrix(int n, int m, int mx){ //Конструктор с рандомной генерацией
        Mtrx = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                this.Mtrx[i][j] = (int) (Math.random() * mx);
            }
        }
    }
    public void setNums(int [][] n){
        this.Mtrx = n;
    }
    public void Swing(int k){ //Переставляем строки с макс и мин в столбце k
        int pos_max = 0;
        int pos_min = 0;
        int buf_max = this.Mtrx[0][k];
        int buf_min = this.Mtrx[0][k];
        for (int i = 0; i < this.Mtrx.length; i++){
            if (this.Mtrx[i][k] > buf_max){
                buf_max = this.Mtrx[i][k];
                pos_max = i;
            }
            if (this.Mtrx[i][k] < buf_min){
                buf_min = this.Mtrx[i][k];
                pos_min = i;
            }
        }
        int [] buf_ar = this.Mtrx[pos_max];
        this.Mtrx[pos_max] = this.Mtrx[pos_min];
        this.Mtrx[pos_min] = buf_ar;
    }
    public void sqr(int i)
    {
        if ((i>this.Mtrx.length)||(i>this.Mtrx[i].length)){
            System.out.println("Error: i>Matrix rank");
        }
        else {
            for (int k = 0; k < i; k++) {
                for (int j=0; j<i; j++) {
                    this.Mtrx[k][j]= (int) Math.pow(this.Mtrx[k][j],2);
                }
            }
        }
    }
    public void Show(){
        for (int i = 0; i < this.Mtrx.length; i++){
            for (int j = 0; j < this.Mtrx[i].length; j++){
                System.out.print(this.Mtrx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}