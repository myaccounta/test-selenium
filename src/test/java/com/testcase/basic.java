package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basic {
    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp()  {
        driver = new ChromeDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown()  {
        driver.quit();
    }
}
