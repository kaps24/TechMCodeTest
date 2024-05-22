package org.codetest.testcases;

import org.codetest.businessflow.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplication extends TestBase{

    @Test
    public static void multiply() {
        Calculator.ClickWholeEquation("2*5");
        Assert.assertEquals(Calculator.result(), "10");
    }
}
