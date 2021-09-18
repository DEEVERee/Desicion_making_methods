package com.dmitriy.veretelnikov;

import org.junit.Assert;
import org.junit.Test;

public class ValdaTest {
    @Test
    public void testValda() {
        Valda valda = new Valda();
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        int actual = valda.calculate(arr, company, scenario);
        int expected = 15;
        Assert.assertTrue(expected == actual);
    }
}