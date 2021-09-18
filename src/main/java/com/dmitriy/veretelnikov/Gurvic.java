package com.dmitriy.veretelnikov;

public class Gurvic {
    private static double[] criteriaGurvic(int[][] arr, int c, int s, double pes) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double[] resultArray = new double[c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            resultArray[i] = (pes * min) + (1 - pes) * max;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
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
        System.out.println("Критерій Гурвіца.");
        double[] answerGurvic = getMaxAnswer(criteriaGurvic(arr, c, s, 0.5), c);
        System.out.println("Найкращий результат=" + answerGurvic[0] + ",тому фірмі рекомендується придбати пакет акцій підприємства номер " + (int) answerGurvic[1]);
        return answerGurvic[0];
    }

    public static void main(String[] args) {
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        calculate(arr, company, scenario);
    }
}
