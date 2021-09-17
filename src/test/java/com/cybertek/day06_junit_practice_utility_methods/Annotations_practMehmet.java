package com.cybertek.day06_junit_practice_utility_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Annotations_practMehmet extends TestBase {

    @Test
    public void test1(){
        System.out.println("Yahoo");
        driver.get("https://search.yahoo.com/");

        String actualResult=driver.getTitle();
                String expectedResult="Yahoo Search - Web Search";

        Assertions.assertEquals(expectedResult, actualResult);//to verify your result

    }
}
