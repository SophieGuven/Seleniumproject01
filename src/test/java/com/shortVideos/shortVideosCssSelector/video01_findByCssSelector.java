package com.shortVideos.shortVideosCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class video01_findByCssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://search.yahoo.com");

        //use css selector tho identify search box and enter "css selector"
            //#yschsp
            //input#yschsp or input[id='uschsp']
            //input[name='p']
            //input[name='p'][class='sbq']  or  input.sbq[name='p']
            //div>input[name='p']
            //div#sbq-wrap>input[name='p']
            //#sbq-wrap>#yschsp
        WebElement searchBox= driver.findElement(By.cssSelector("#yschsp"));
        searchBox.sendKeys("css selector");

        //click on x icon to clear out the text
            //button#sbq-clear>span
            //button#sbq-clear>span.sprite or div#sbq-clear>span[class='sprite']
            //button[id='sbq-clear]>span.sprite
            //button[type='button'][class='sbq-x']>span
        WebElement clearIcon= driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        //enter "selenium locators" into search box
        searchBox.sendKeys("selenium locators");

        //identify search icon and click on it
            //span[title='Search']
        WebElement searchIcon= driver.findElement(By.cssSelector("span[title='Search']"));
       searchIcon.click();


        driver.quit();




    }
}
