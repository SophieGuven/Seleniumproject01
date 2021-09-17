package com.cybertek.day06_junit_practice_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedPractice {

    WebDriver driver;//driver needs to be instance


    @BeforeEach
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testLogin() {
        driver.get("http://practice.cybertekschool.com/registration_form");
        String xpathForErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']";

        WebElement strLengthErrorElement = driver.findElement(By.xpath(xpathForErrorMsg));
        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

        WebElement firstNameField= driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("a");
        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());


    }
}