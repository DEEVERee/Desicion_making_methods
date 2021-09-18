package com.dmitriy.veretelnikov;


public class Demo {
    public static void main(String[] args) {
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        System.out.println("Матриця виграшів.");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        Laplas.calculate(arr, company, scenario);
        Valda.calculate(arr, company, scenario);
        Sevidge.calculate(arr, company, scenario);
        Gurvic.calculate(arr, company, scenario);
        System.out.println();
    }
}
