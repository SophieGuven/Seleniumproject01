package com.shortVideos.shortVideosCanvas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //make the window maximized
        driver.manage().window().maximize();

        //print out the page title
        String title= driver.getTitle();
        System.out.println("title = " + title);


        //Enter username provided: standard_user
        WebElement usernameBox= driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");

        //Enter password provided : secret_sauce
        WebElement passwordBox= driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        //click on login button to Log in
        WebElement loginBottn= driver.findElement(By.id("login-button"));
        loginBottn.submit();

        //Get the name and price of first product

        //assuming we know the product name, just use link text
        WebElement firstProductLink= driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = " + firstProductLink.getAttribute("id"));

        //assuming we dont know the product name but we know we want to get first item anyway
        WebElement firstProductLnk1= driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductLnk1.getText() = " + firstProductLnk1.getText());

        WebElement firstProdctLnk2= driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProdctLnk2.getText() = " + firstProdctLnk2.getText());


        //Get all product names into List<WebElement>
        //get the count
        //printout the text of all products
        List<WebElement> allitems= driver.findElements(By.className("inventory_item_name"));
        System.out.println("allitems.size() = " + allitems.size());
        for (WebElement eachItem : allitems) {
            System.out.println("eachItem.getText() = " + eachItem.getText());
        }
        //click on the shopping cart link top right corner
        WebElement shoppingCart= driver.findElement(By.id("shopping_cart_container"));
        shoppingCart.click();

        Thread.sleep(3000);

        WebElement countinueShoppingBtn= driver.findElement(By.id("continue-shopping"));
        countinueShoppingBtn.click();

        driver.quit();



    }
}
