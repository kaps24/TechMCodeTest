package org.codetest.testcases;

import org.codetest.businessflow.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Subtraction extends TestBase{

    @Test
    public static void subtraction() {
        Calculator.ClickWholeEquation("5-1");
        Assert.assertEquals(Calculator.result(), "4");
    }
}
