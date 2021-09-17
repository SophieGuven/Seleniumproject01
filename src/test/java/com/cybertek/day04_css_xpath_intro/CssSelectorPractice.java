package com.cybertek.day04_css_xpath_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate 2 elements using css selector
            //input[name='email']
        WebElement emailBox= driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        //retrive
                //#form_submit
                //button#form_submit
                //button#form_submit.radius
        WebElement retriveBtn= driver.findElement(By.cssSelector("#form_submit"));
      retriveBtn.click();

      //identify the success message and print out the text
        WebElement conformationMsg= driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        System.out.println("conformationMsg.getText() = " + conformationMsg.getText());
    }
}
