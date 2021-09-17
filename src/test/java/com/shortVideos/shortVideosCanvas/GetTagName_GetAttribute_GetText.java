package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName_GetAttribute_GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        //identify and save the searchbox element and enter Selenium
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Java");
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());

        //Get value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        //identify and save the search button element
        WebElement searchButtn= driver.findElement(By.name("btnK"));

        //get the tag name of the element, get, class attribute
        System.out.println("searchButtn.getTagName() = " + searchButtn.getTagName());
        System.out.println("searchButtn.getAttribute(\"class\") = " + searchButtn.getAttribute("class"));
        searchButtn.submit();

        WebElement searchResult= driver.findElement(By.id("result-stats"));
        String resultText = searchResult.getText();
        System.out.println("resultText = " + resultText);

        driver.quit();
    }
}
