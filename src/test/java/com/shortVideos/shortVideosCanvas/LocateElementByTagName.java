package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateElementByTagName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink= driver.findElement(By.tagName("a"));
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink.getText() = " + eachLink.getText());

        }
        firstLink.click();


        driver.quit();

    }
}
