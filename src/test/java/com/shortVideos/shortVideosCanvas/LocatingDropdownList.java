package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement= driver.findElement(By.id("dropdown"));

        //wrap this element inside Select object
        Select selectObj= new Select(dropDownElement);

        //use ready methods to select options
        selectObj.selectByIndex(2);//select 3rd item at index 2
        selectObj.selectByValue("1");// select item with value attribute 1
        selectObj.selectByVisibleText("Option 2");



        WebElement multiDropDown= driver.findElement(By.name("Languages"));
        //wrap this element into Select object
        Select multiItemSelect= new Select(multiDropDown);
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());//true

        //check if this multi select list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        //deselect items
        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByVisibleText("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();

      //  driver.quit();


    }
}
