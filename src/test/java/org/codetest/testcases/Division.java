package org.codetest.testcases;

import org.codetest.businessflow.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Division extends TestBase{

    @Test
    public static void division() {
        Calculator.ClickWholeEquation("30/5");
        Assert.assertEquals(Calculator.result(), "6");
    }
}
