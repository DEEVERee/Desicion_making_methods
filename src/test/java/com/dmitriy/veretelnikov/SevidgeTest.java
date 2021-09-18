package com.dmitriy.veretelnikov;

import org.junit.Assert;
import org.junit.Test;

public class SevidgeTest  {
    @Test
    public void testSevidge(){
        Sevidge sevidge = new Sevidge();
        int company = 4;
        int scenario = 4;
        int[][] arr = new int[][]{{28, -54, 36, -54},
                {15, 42, 15, 15},
                {-15, 15, -15, 36},
                {30, -24, 30, -24}};
        int actual = sevidge.calculate(arr, company, scenario);
        int expected = 21;
        Assert.assertTrue(expected == actual);
    }

}