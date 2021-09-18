package com.dmitriy.veretelnikov;

import org.junit.Assert;
import org.junit.Test;

public class GurvicTest {
    @Test
    public void testGurvic(){
        Gurvic gurvic = new Gurvic();
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        double actual = gurvic.calculate(arr, company, scenario);
        double expected = 28.5;
        Assert.assertTrue(expected == actual);
    }

}