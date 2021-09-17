package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase{

    /**
     * This class is meant to be super class
     * to provide driver set up and closing browser
     * for it's subclasses
     */


      protected WebDriver driver ;
        // setting up all driver stuff here directly in @BeforeEach method
        @BeforeEach
        public void setupWebDriver(){
           // WebDriverManager.chromedriver().setup();
         //   driver = new ChromeDriver();
          //  driver.manage().window().maximize();
            driver= WebDriverFactory.get("chrome");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @AfterEach
        public void closeBrowser(){
            driver.quit();
        }

    }
