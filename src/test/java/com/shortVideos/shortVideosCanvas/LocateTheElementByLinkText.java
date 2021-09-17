package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTheElementByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");

        WebElement aboutLink= driver.findElement(By.linkText("About"));

        aboutLink.click();
        Thread.sleep(3000);

        WebElement productLink= driver.findElement(By.linkText("Products"));
        productLink.click();

        driver.quit();


    }
}
