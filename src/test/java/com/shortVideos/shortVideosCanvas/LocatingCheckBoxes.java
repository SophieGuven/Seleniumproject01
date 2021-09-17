package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1= driver.findElement(By.id("box1"));
        System.out.println("Before click checkBox1.isSelected() = " + checkBox1.isSelected());
        checkBox1.click();
        System.out.println("After checkBox1.isSelected() = " + checkBox1.isSelected());

        //if we want to check the checkbox
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }else {
            System.out.println("checkbox 1 is already selected");
        }

    driver.quit();
    }
}
