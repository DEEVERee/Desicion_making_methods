package com.dmitriy.veretelnikov;


public class Laplas {
    private static double[] criteriaLaplas(int[][] arr, int c, int s) {
        double sum = 0;
        double[] resultArray = new double[c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                sum += arr[i][j];
            }
            resultArray[i] = sum / s;
            sum = 0;
        }
        return resultArray;
    }

    private static double[] getMaxAnswer(double resArr[], int n) {
        double max = Integer.MIN_VALUE;
        int index = 0;
        double[] answerArr = new double[2];
        for (int i = 0; i < n; i++) {
            if (resArr[i] > max) {
                max = resArr[i];
                index = i + 1;
                answerArr[0] = max;
                answerArr[1] = index;
            }
        }
        return answerArr;
    }

    public static double calculate(int[][] arr, int c, int s) {
        double[] answerLaplas = getMaxAnswer(criteriaLaplas(arr, c, s), c);
        System.out.println("Критерій Лапласа.");
        System.out.println("Найкращий результат=" + answerLaplas[0] + ",тому фірмі рекомендується придбати пакет акцій підприємства номер " + (int) answerLaplas[1]);
        return answerLaplas[0];
    }

    public static void main(String[] args) {
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        System.out.println(calculate(arr, company,scenario));
    }
}
