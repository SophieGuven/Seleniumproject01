package com.shortVideos.shortVideosCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateElementByCssSelector_FormTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");

        //locate elements using css selector
        WebElement firstnameField= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstnameField.sendKeys("Sophie");

        WebElement lastnameField= driver.findElement(By.cssSelector("input[name='lastname']"));
        lastnameField.sendKeys("Guven");

        WebElement usernameField= driver.findElement(By.cssSelector("input[name='username'"));
        usernameField.sendKeys("sophieguven");

        WebElement emailField= driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("sophieguven@gmail.com");

        WebElement passwordField= driver.findElement(By.cssSelector("input[name='password'][type='password']"));
        passwordField.sendKeys("topsecretthere");

        WebElement phoneField= driver.findElement(By.cssSelector("input[name='phone'][type='tel']"));
        phoneField.sendKeys("484-347-7960");

        WebElement genderRadioBtn= driver.findElement(By.cssSelector("input[name='gender'][value='female']"));
        genderRadioBtn.click();

        WebElement birthdayField= driver.findElement(By.cssSelector("input[name='birthday']"));
        birthdayField.sendKeys("01/01/1983");

        WebElement dropdownElm= driver.findElement(By.cssSelector("select[name='department']"));
        Select dropdownObj= new Select(dropdownElm);
        dropdownObj.selectByIndex(2);

        WebElement jobTitleDropDown= driver.findElement(By.cssSelector("select[name='job_title']"));
        Select titleSelectObj= new Select(jobTitleDropDown);
        titleSelectObj.selectByIndex(3);

        WebElement checkbox1= driver.findElement(By.cssSelector("#inlineCheckbox1"));
        checkbox1.click();

        WebElement signUpbttn= driver.findElement(By.cssSelector("#wooden_spoon"));
        signUpbttn.click();


        driver.quit();



    }
}
