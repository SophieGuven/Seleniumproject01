package com.shortVideos.shortVideosCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByXPath_Yahoo_Search {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://search.yahoo.com");

        //use xpath to identify search box and enter "xpath"
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='yschsp']"));
        searchBox.sendKeys("xpath");

        //click on x icon to clear out the text
      //  WebElement clearIcon= driver.findElement(By.xpath("//span[@class='sprite']"));
      //  clearIcon.click();
        driver.findElement(By.xpath("//button[@id='sbq-clear']//span[@class='sprite']")).click();
        //no need to save it thats why we dont create a variable

        searchBox.sendKeys("selenium locators");

        driver.findElement(By.xpath("//span[@title='Search']")).click();

        driver.quit();

    }
}
