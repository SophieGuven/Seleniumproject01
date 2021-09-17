package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTheElementByName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        WebElement searchBottun= driver.findElement(By.name("btnK"));
        searchBottun.submit();

        driver.quit();



    }
}
