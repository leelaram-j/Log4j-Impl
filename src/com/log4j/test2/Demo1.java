package com.log4j.test2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Demo1
{
    private static Logger Log = LogManager.getLogger(Demo1.class.getName());
    @Test
    public void LoginTest()
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver .get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("[value='Confirmation Alert']")).click();
        Log.debug("Clicking confirmation Alert");
        try {
            Thread.sleep(3000);
            Log.info("Waiting 3 seconds");
        } catch (InterruptedException e) {
            Log.fatal("Interuppted Exception Catch");
            Log.error("Getting error in wait section");
        }
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Log.debug("printing alert text-->"+alert.getText());
        alert.accept();
        Log.debug("Accepting Alert");

    }

}
