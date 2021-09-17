package com.cybertek.day1_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_FireFox {
    public static void main(String[] args) {

        //set up FireFox driver
        WebDriverManager.firefoxdriver().setup();

        //create webDriver instance using FireFoxDriver object
        WebDriver driver= new FirefoxDriver();

        //navigate to "https://cybertek.com"
        driver.get("https://cybertekschool.com");

        System.out.println("About to quit ");
        //quit the browser
        driver.quit();

    }
}
