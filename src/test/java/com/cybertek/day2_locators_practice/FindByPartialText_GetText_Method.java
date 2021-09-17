package com.cybertek.day2_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetText_Method {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //identify the link using partial link text then get the full text out
        //using partial link text than get the full text out using new method getText
        WebElement myLink= driver.findElement(By.partialLinkText("Disappearing"));
       // System.out.println("myLink.getText() = "+myLink.getText());

        String fullLinkText= myLink.getText();
        System.out.println("fullLinkText = " + fullLinkText);

        //what if I just provide partial link as letter A
        WebElement linkA= driver.findElement(By.partialLinkText("A"));
        System.out.println("linkA.getText() = " + linkA.getText());//it will show the very first matching text

        //Consol is showing the link text


        driver.close();
    }


}
