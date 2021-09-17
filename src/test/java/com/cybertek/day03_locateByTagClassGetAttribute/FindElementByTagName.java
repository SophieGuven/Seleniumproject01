package com.cybertek.day03_locateByTagClassGetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        /*
        Purple tag name
        Orange attribute name
        blue attribute value
        black text
         */

        WebElement firstlink= driver.findElement(By.tagName("a"));//identify first element with tag name <a>

        //gget the text to find out
        System.out.println("firstlink.getText() = " + firstlink.getText());

        //what if i wanted to find and store all elements with <a> tag--->findElements
        List<WebElement> allAtagElements= driver.findElements(By.tagName("a"));
        System.out.println("allAtagElements.size() = " + allAtagElements.size());

        //iterate over this list, get the text of the link and get attribute and print them out
        for (WebElement eachElement : allAtagElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
            System.out.println("eachElement.getAttribute(\"href\") = " + eachElement.getAttribute("href"));
        }

        //get first element with <h1> tag and get the text out of it
        WebElement firstH1TagElm= driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElm.getText() = " + firstH1TagElm.getText());

        WebElement useSpan = driver.findElement(By.tagName("span"));
        System.out.println("useSpan.getText() = " + useSpan.getText());


    }
}
