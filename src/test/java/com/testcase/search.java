package com.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class search extends basic {

    @Test
    public void SearchTest() throws Exception {
        String inputText = "PWC";
        driver.get("http://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement inputBox = driver.findElement(By.xpath("//input[@id='kw']"));
        inputBox.sendKeys(inputText);
        WebElement baidusearch = driver.findElement(By.cssSelector("[type='submit']"));
        baidusearch.click();
        Thread.sleep(5000);
        getSearchReusltURL();

    }

    public void getSearchReusltURL() {
        List<WebElement> myElements = driver.findElements(By.cssSelector(".c-container >h3 >a"));
        for (WebElement option : myElements) {
            String strText = option.getAttribute("href");
            System.out.println(strText);
            Reporter.log(strText);
        }
    }
}
