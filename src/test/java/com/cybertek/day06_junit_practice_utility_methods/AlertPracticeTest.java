package com.cybertek.day06_junit_practice_utility_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {
    @Test
    public void testJavaScriptAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        System.out.println("getting the text of alert = " + driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();//driver first need to swithc tho the allert box since it's not part
                                            //of htmlto return a type alert from selenium and it has 4 methods
        //1-accept()-->click on ok button
        //2-dismiss()-->click on cancel button
        //3-sendKey(yourText)-->enter text into prompt

    //    Alert alertObj= driver.switchTo().alert();//adding commit
    //    alertObj.accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().dismiss(); // this will click on dismiss button for cancel
     //   driver.switchTo().alert().accept();//this will click for ok


        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();

        System.out.println("the end");

    }


}
