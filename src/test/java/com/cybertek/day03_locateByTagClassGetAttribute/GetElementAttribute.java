package com.cybertek.day03_locateByTagClassGetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class GetElementAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //get the first link on the page and get href attribute
        WebElement firstLink= driver.findElement(By.linkText("A/B Testing"));

        //get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        //get any attribute of identified element , in this case href
        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        //navigate to google.com and identify the seacrchbox and get couple attributes value
        driver.navigate().to("https://google.com");
        //identify the searchBox
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        //get the class attribute
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        //maxlength
        System.out.println("searchBox.getAttribute(\"maxlength\") = " + searchBox.getAttribute("maxlength"));

        //title
        System.out.println("searchBox.getAttribute(\"title\") = " + searchBox.getAttribute("title"));


        //autocapitalize
        System.out.println("searchBox.getAttribute(\"autocapitalize\") = "
                + searchBox.getAttribute("autocapitalize"));
        //spellcheck
        System.out.println("searchBox.getAttribute(\"spellcheck\") = "
                + searchBox.getAttribute("spellcheck"));
        //role
        System.out.println("searchBox.getAttribute(\"role\") = "
                + searchBox.getAttribute("role"));

        //using value attribute of input text box to extract the text inside
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        //homework google search button
        //class and value
        WebElement searchBottum = driver.findElement(By.name("btnK"));
        System.out.println("searchBottum.getAttribute(\"class\") = " + searchBottum.getAttribute("class"));

        System.out.println("searchBottum.getAttribute(\"value\") = " + searchBottum.getAttribute("value"));


        driver.quit();

    }
}
