package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();

        //click on red radiobutton
        WebElement redRadioBttn= driver.findElement(By.id("red"));
        System.out.println("redRadioBttn.isSelected() = " + redRadioBttn.isSelected());
        redRadioBttn.click();
        System.out.println("After clicking redRadioBttn.isSelected() = " + redRadioBttn.isSelected());
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        //identify green radio button
        WebElement greenRadioBttn= driver.findElement(By.id("green"));
        greenRadioBttn.click();
        System.out.println("greenRadioBttn.isSelected() = " + greenRadioBttn.isSelected());
        System.out.println("greenRadioBttn.isEnabled() = " + greenRadioBttn.isEnabled());//false

        List<WebElement> allColorRadios= driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());

        for (WebElement eachRadios : allColorRadios) {
            System.out.println("current radio button is = " + eachRadios.getAttribute("id"));
            System.out.println("is it enabled? = " + eachRadios.isEnabled());
            System.out.println("is it selected? = " + eachRadios.isSelected());

        }


        driver.quit();



    }
}
