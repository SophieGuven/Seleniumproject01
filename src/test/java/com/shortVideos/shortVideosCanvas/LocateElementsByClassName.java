package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateElementsByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify the span elemnt with class name 'h1y'
        WebElement elm= driver.findElement(By.className("h1y"));
        System.out.println("elm.getText() = " + elm.getText());
        System.out.println("elm.getAttribute(\"class\") = " + elm.getAttribute("class"));

        //identify first item in unordered list using class name
        WebElement firstElement = driver.findElement(By.className("list-group-item"));
        System.out.println("firstElement.getText() = " + firstElement.getText());

        List<WebElement> allItems= driver.findElements(By.className("list-group-item"));
        System.out.println("allItems.size() = " + allItems.size());

        for (WebElement eachItem : allItems) {
            System.out.println("eachItem.getText() = " + eachItem.getText());

        }

        //driver.quit();
    }
}
