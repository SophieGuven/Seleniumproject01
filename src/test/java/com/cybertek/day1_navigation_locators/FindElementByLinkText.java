package com.cybertek.day1_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Everything is awesome");

        WebElement searchBttn= driver.findElement(By.name("btnK"));
        searchBttn.submit();

        driver.navigate().back();

        Thread.sleep(3000);

        WebElement abutLink= driver.findElement(By.linkText("About"));
        abutLink.click();

        Thread.sleep(3000);

        driver.quit();


    }
}
/*
 // set up chrome driver , open chrome


        // navigate to https://google.com

        // try to identify search box using both name and id

        // submit the search by clicking on the search button

        // navigate back to google home page

        // wait few second

        // click on about link


        // wait few seconds

        // close the browser

 */
