package com.shortVideos.jUnitVideos.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    public void testAddition(){
        System.out.println("Hello World testAddition");

        int num1=6;
        int num2=8;
        int expectedResult=14;

        assertEquals(expectedResult, num1+num2);


    }

    @Test
    public void testString(){
        System.out.println("msg from testString");
        String name= "Junit5";
        assertEquals("Junit5", name);
    }


}
