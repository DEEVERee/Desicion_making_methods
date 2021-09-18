package com.dmitriy.veretelnikov;


import org.junit.Assert;
import org.junit.Test;

public class LaplasTest {
    @Test
    public void testLaplas() {
        Laplas laplas = new Laplas();
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        double actual=laplas.calculate(arr,company,scenario);
        double expected = 21.75;
        Assert.assertTrue(expected==actual);
    }

}