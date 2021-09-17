package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTheElementByid {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        WebElement inputBox= driver.findElement(By.id("ybar-sbq"));

        //enter text hello
        inputBox.sendKeys("hello");

        WebElement searchButton= driver.findElement(By.id("ybar-search"));

        //click the searchbottun
        searchButton.click();

        Thread.sleep(3000);

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);


        driver.quit();
    }
}
