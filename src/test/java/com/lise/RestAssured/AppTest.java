package com.lise.RestAssured;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.*;

public class AppTest
{
    @BeforeSuite
    public void test(){
        System.out.println("This will execute before every method..");
    }

    @Test
    @Owner("Ratnesh")
    @Severity(SeverityLevel.NORMAL)
    @Description("This is demo.. of report file...")
    public void setUp(){
        System.out.println("This is Demo one..");
    }

    @AfterSuite
    public void test1(){
        System.out.println("This will execute after every method...");
    }
}
