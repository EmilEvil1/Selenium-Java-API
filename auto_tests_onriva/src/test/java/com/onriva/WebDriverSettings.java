package com.onriva;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class WebDriverSettings{

    public ChromeDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/emil/Downloads/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.onriva.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Search across the web for the cheapest flights & lowest airfares - Onriva"));
    }


//    @After
//    public void close() {
//        driver.quit();
//    }
}
