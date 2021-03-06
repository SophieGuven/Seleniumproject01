package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingDropdownList_withNoSelectTag {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //click the open "unusual" dropdown without select tag
        WebElement dropdownLink= driver.findElement(By.linkText("Dropdown link"));
        dropdownLink.click();

        //click item(link) with text Google
        WebElement itemGoogle = driver.findElement(By.linkText("Google"));
        itemGoogle.click();

        driver.quit();
    }


}
