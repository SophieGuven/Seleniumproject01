package com.cybertek.day2_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //get all the links that have partial text A in it
        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));
            //get the size of this list so we know how many link with partial text A
        System.out.println("allLink.size() = " + allLink.size());

        //get the first item
        WebElement firstItem = allLink.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());

        WebElement secondItem= allLink.get(1);
        System.out.println("allLink.get(1).getText() = " + allLink.get(1).getText());

        //iterate over whole list and print out the text---->iter
        for(WebElement eachLink : allLink){
            System.out.println("eachLink.getText() = " + eachLink.getText());
        }


        //findElement method will throw exception when it can not find element
        //findElement method will return empty List<WebElement>


        driver.quit();
    }
}
