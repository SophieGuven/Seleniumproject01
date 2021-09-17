package com.shortVideos.iFrame;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void test_iFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");

        //***switch to the iframe using index
                //driver.switchTo().frame(0);

        //***switch to the iframe using id or name
                //driver.switchTo().frame("mce_0_ifr");

        //***switch to the iframe using WebElement
        WebElement iFrame= driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrame);


        //identify the <p> element inside the frame
        WebElement pTagElemInsideFrame= driver.findElement(By.tagName("p"));
        System.out.println("pTagElemInsideFrame = " + pTagElemInsideFrame.getText());

        //click on home button to go back to main page
        //we should go out of the frame..Bc it is still on the frame page
        //we should switch out of the frame

            //driver.switchTo().defaultContent();//this will switch to top level html

        driver.switchTo().parentFrame();//this will switch back up one level inside nested html document

        driver.findElement(By.linkText("Home")).click();

    }

    @Test
    public void test_Nested_iFrame(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        //main content -->top, bottom frame

        //top--> left, middle, right frame

        //get the text out of bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrmBodyElm= driver.findElement(By.tagName("body"));
        System.out.println("bottomFrmBodyElm.getText() = " + bottomFrmBodyElm.getText());

        //switch to parent frame
       //        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();


        //go to the middle frame and get to the text
        //first go to top frame then go to middle frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv= driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

    }



}
