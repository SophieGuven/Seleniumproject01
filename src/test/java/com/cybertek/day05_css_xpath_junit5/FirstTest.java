package com.cybertek.day05_css_xpath_junit5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {//click class run button to run all @Test s

    //test method is annotated with @Test annotation
    //it is a void method with no parameter

    @Test
    public void testAddition(){

        int num1 = 10;
        int num2 = 5;
        int expectedResult=15;
        Assertions.assertEquals(expectedResult, num1+num2);

    }

    @Test
    public void testString(){
        String msg = "I love Selenium";
        //assert this msg equal "I love Selenium"
        Assertions.assertEquals("I love Selenium", msg);

        //assert this msg starts with "I love"
        Assertions.assertTrue(msg.startsWith("I love"));

        //Assertions.assertTrue(msg.startsWith("Ilove"));


    }

}
