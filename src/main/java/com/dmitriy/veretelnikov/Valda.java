package com.dmitriy.veretelnikov;

public class Valda {
    private static int[] criteriaValda(int[][] arr, int c, int s) {
        int min = Integer.MAX_VALUE;
        int[] minArray = new int[c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            minArray[i] = min;
            min = Integer.MAX_VALUE;
        }
        return minArray;
    }

    private static int[] getMaxAnswer(int[] resArr, int n) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int[] answerArr = new int[2];
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

    public static int calculate(int[][] arr, int c, int s) {
        System.out.println("Критерій Вальда.");
        int[] answerValda = getMaxAnswer(criteriaValda(arr, c, s), c);
        System.out.println("Найкращий результат=" + answerValda[0] + ",тому фірмі рекомендується придбати пакет акцій підприємства номер " + answerValda[1]);
        return answerValda[0];
    }

    public static void main(String[] args) {
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        System.out.println(calculate(arr, company, scenario));
    }
}
