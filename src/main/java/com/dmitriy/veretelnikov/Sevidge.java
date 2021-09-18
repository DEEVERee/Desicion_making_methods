package com.dmitriy.veretelnikov;

public class Sevidge {
    private static int[][] matrixOfRisks(int[][] arr, int c, int s) {
        int max = 0;
        int[][] arrRisk = new int[c][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }

            for (int j = 0; j < c; j++) {
                arrRisk[j][i] = max - arr[j][i];
            }
            max = 0;
        }
        return arrRisk;
    }

    private static int[] criteriaSevidge(int[][] arr, int c, int s) {
        int max = Integer.MIN_VALUE;
        int[] maxArray = new int[c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxArray[i] = max;
            max = Integer.MIN_VALUE;
        }
        return maxArray;
    }

    private static int[] getMinAnswer(int[] resArr, int n) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        int[] answerArr = new int[2];
        for (int i = 0; i < n; i++) {
            if (min > resArr[i]) {
                min = resArr[i];
                index = i + 1;
                answerArr[0] = min;
                answerArr[1] = index;
            }
        }
        return answerArr;
    }

    public static int calculate(int[][] arr, int c, int s) {
        //System.out.println("Матриця ризиків.");
        for (int[] i : matrixOfRisks(arr, c, s)) {
            for (int j : i) {
                //System.out.print(j + "\t");
            }
            //System.out.println();
        }
        int[] answerSevidge = getMinAnswer(criteriaSevidge(matrixOfRisks(arr, c, s), c, s), c);
        System.out.println("Критерій Севіджа.");
        System.out.println("Найкращий результат=" + answerSevidge[0] + ",тому фірмі рекомендується придбати пакет акцій підприємства номер " + answerSevidge[1]);
        return answerSevidge[0];
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
