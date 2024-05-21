package org.codetest.utils.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersDriver {

    private WebDriver driver;

    public WebDriver createDriver(String browserName) {

        if (driver != null) return driver;
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            return new ChromeDriver();
        } else if (browserName.equals("Edge") || browserName.equals("Ie") || browserName.equals("Safari") || browserName.equals("Firefox") || browserName.equals("Opera")) {
            throw new WebDriverException(String.format("%s browser not implemented yet", browserName));
        }
        throw new WebDriverException("Invalid browser name");
    }

    private WebDriver ChromeDriver() {
        try {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } catch (Exception ex) {
            throw new WebDriverException(String.format("Couldn't create driver", ex.getMessage()));
        }
    }

}
