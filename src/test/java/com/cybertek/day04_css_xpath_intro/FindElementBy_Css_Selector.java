package com.cybertek.day04_css_xpath_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementBy_Css_Selector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        //todo: identify seachbox using css selector
        //try different way, by id, by name
       //1--> WebElement searchBox= driver.findElement(By.cssSelector("#yschsp"));//# means id
     //2-->   WebElement searchBox= driver.findElement(By.cssSelector("input[name='p']"));
     //3-->   WebElement searchBox= driver.findElement(By.cssSelector("input[id='yschsp']"));
        WebElement searchBox= driver.findElement(By.cssSelector("input[name='p'][type= 'text']"));

        searchBox.sendKeys("CSS SELECTOR");

        //<button id="sbq-clear" type="button" class="sbq-x"><span class="sprite"></span></button>
       WebElement clearIcon= driver.findElement(By.cssSelector("button#sbq-clear>span"));
       clearIcon.click();

        //identify search botton by using css selector
       // <span role="button" title="Search" class="ico-syc mag-glass"></span>
        WebElement seaarchbottn= driver.findElement(By.cssSelector("span[title='Search']"));
        seaarchbottn.click();

       // driver.quit();

    }
}
