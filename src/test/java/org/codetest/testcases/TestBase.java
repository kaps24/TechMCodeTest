package org.codetest.testcases;

import org.codetest.businessflow.Calculator;
import org.codetest.constant.Constant;
import org.codetest.utils.browsers.BrowsersDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {

    private static WebDriver driver;
    protected Calculator calc;

    @AfterTest
    public static void AfterTestRun() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @BeforeTest
    @Parameters({"env", "browserType"})
    public void SetUpTest(String env, String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            BrowsersDriver browsersDriver = new BrowsersDriver();
            driver = browsersDriver.createDriver(browserType);
        }

        if (env.equalsIgnoreCase("PROD")) {
            driver.get(Constant.ENVPROD);
            calc = new Calculator(driver);
        } else if (env.equalsIgnoreCase("STAGE")) {
            driver.get(Constant.ENVSTAG);
            calc = new Calculator(driver);

        }
    }
}
