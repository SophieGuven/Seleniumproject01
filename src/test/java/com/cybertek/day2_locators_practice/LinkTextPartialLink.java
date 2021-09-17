package com.cybertek.day2_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLink {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //click on first link A/B testing
     //   WebElement firstlnk= driver.findElement(By.linkText("A/B Testing"));
    //    firstlnk.click();
        driver.findElement(By.linkText("A/B Testing")).click();


        //navigate back to home page
        driver.navigate().back();

        //Maximize the screen
        driver.manage().window().maximize();

        //click on second link, either full linkText or PartialLink text
     //   driver.findElement(By.linkText("Add/Remove Elements")).click();
        WebElement addOrRemoveLink= driver.findElement(By.partialLinkText("Add/Remove"));
        addOrRemoveLink.click();

        //click on home link to go back home
        driver.findElement(By.linkText("Home")).click();

        //click on "Redirect link'
        driver.findElement(By.linkText("Redirect Link")).click();


        //close browser
      //  driver.close();
    }
}