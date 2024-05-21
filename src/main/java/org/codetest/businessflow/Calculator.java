package org.codetest.businessflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

    @FindBy(id = "add")
    private static WebElement add;
    @FindBy(id = "subtract")
    private static WebElement subtract;
    @FindBy(id = "multiply")
    private static WebElement multiply;
    @FindBy(id = "divide")
    private static WebElement divide;
    @FindBy(xpath = "//input[@value= 'C']")
    private static WebElement clear;
    @FindBy(xpath = "//input[@value= '0']")
    private static WebElement zero;
    @FindBy(xpath = "//input[@value= '1']")
    private static WebElement number1;
    @FindBy(xpath = "//input[@value= '2']")
    private static WebElement number2;
    @FindBy(xpath = "//input[@value= '3']")
    private static WebElement number3;
    @FindBy(xpath = "//input[@value= '4']")
    private static WebElement number4;
    @FindBy(xpath = "//input[@value= '5']")
    private static WebElement number5;
    @FindBy(xpath = "//input[@value= '6']")
    private static WebElement number6;
    @FindBy(xpath = "//input[@value= '7']")
    private static WebElement number7;
    @FindBy(xpath = "//input[@value= '8']")
    private static WebElement number8;
    @FindBy(xpath = "//input[@value= '9']")
    private static WebElement number9;
    @FindBy(xpath = "//input[@value= '=']")
    private static WebElement equalTo;
    @FindBy(xpath = "//input[@value= '.']")
    private static WebElement dot;
    @FindBy(id = "display")
    private static WebElement result;

    public Calculator(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String result() {
        equalTo.click();
        return result.getText().trim();
    }

    public static void ClickWholeEquation(String equation) {
        for (char character : equation.trim().toCharArray())
            clickElement(character);
    }

    public static void clickElement(char character) {
        switch ((int) character) {
            case 42:
                multiply.click();
                break;
            case 43:
                add.click();
                break;
            case 45:
                subtract.click();
                break;
            case 46: // .
                dot.click();
                break;
            case 47:
                divide.click();
                break;
            case 48:
                zero.click();
                break;
            case 49:
                number1.click();
                break;
            case 50:
                number2.click();
                break;
            case 51:
                number3.click();
                break;
            case 52:
                number4.click();
                break;
            case 53:
                number5.click();
                break;
            case 54:
                number6.click();
                break;
            case 55:
                number7.click();
                break;
            case 56:
                number8.click();
                break;
            case 57:
                number9.click();
                break;
            case 61:
                equalTo.click();
                break;
        }
    }
}
