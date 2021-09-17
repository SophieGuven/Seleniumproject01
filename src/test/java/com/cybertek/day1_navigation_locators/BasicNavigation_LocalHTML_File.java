package com.cybertek.day1_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/Sophie/OneDrive/Desktop/HTMLclass/myFirstPage.html");

        //driver.quit();
    }
}
