package com.cybertek.day05_css_xpath_junit5;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationDemoTest {


    @BeforeEach
    public void test3(){
        System.out.println("@BeforeEach and run");
    }
    @Test
    public void test(){
        System.out.println("test1 is running ");
    }
    @Test
    public void test2(){
        System.out.println("test2 is running");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("@AfterAll run once after all test");
    }

    @BeforeAll
    public static void intit(){
        System.out.println("@BeforeAll run once before all test");
    }
    @AfterEach
    public void test4(){
        System.out.println("@afterEach run");
    }
}
