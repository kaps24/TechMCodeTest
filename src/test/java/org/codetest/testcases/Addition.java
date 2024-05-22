package org.codetest.testcases;

import org.codetest.businessflow.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Addition extends TestBase {

    @Test
    public static void add() {
        Calculator.ClickWholeEquation("1+5");
        Assert.assertEquals(Calculator.result(), "6");
    }
}
