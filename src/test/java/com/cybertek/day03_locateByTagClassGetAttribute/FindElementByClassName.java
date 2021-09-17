package com.cybertek.day03_locateByTagClassGetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByClassName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");


        WebElement elm1= driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        WebElement elm2= driver.findElement(By.className("list-group-item"));
        System.out.println("elm2.getText() = " + elm2.getText());

        List<WebElement> allTagElements= driver.findElements(By.className("list-group-item"));
        System.out.println("allTagElements.size() = " + allTagElements.size());
        for (WebElement eachTagElement : allTagElements) {
            System.out.println("eachTagElement.getText() = " + eachTagElement.getText());

        }

        driver.quit();


    }
}
