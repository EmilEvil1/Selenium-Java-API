package com.onriva;

import org.openqa.selenium.By;

public class ConfigurationFunc extends WebDriverSettings {

    public void searchRoundTrip(String from, String to) {

//      Clear inputs
        driver.findElementByXPath("//*[@id=\"round-trip\"]/div/div[1]/div[1]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"round-trip\"]/div/div[1]/div[3]/div/input").clear();

//      Field Froms
        driver.findElementByXPath("//*[@id=\"round-trip\"]/div/div[1]/div[1]/div/input").sendKeys(from);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementById("searchSelected").click();

//      Field To
        driver.findElement(By.xpath("//*[@id=\"round-trip\"]/div/div[1]/div[3]/div/input")).sendKeys(to);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"round-trip\"]/div/div[1]/div[3]/div/div/div/div[2]")).click();

//      Change calendar date
        driver.findElement(By.xpath("//*[@id=\"dp_widget_container\"]/div[1]/div[2]/table[2]/tbody/tr[2]/td[3]/div/span")).click();

//      Change Travelers
        driver.findElementById("traveler").click();
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[1]/div[2]/div[2]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[1]/div[4]/div[2]/div[3]/button")).click();

//      Change Cabin Class
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[2]/div[2]/div/ul/li[3]")).click();
        driver.findElementByClassName("show-all").click();
    }

    public void searchOneWay(String from, String to) {

//      Click to one-way
        driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div/div[2]/div[1]/div[1]/div[2]/a")).click();

//      Clear inputs
        driver.findElementByXPath("//*[@id=\"oneway-trip\"]/div/div[1]/div[1]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"oneway-trip\"]/div/div[1]/div[3]/div/input").clear();

//      Field From
        driver.findElementByXPath("//*[@id=\"oneway-trip\"]/div/div[1]/div[1]/div/input").sendKeys(from);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementById("searchSelected").click();

//      Field To
        driver.findElement(By.xpath("//*[@id=\"oneway-trip\"]/div/div[1]/div[3]/div/input")).sendKeys(to);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"oneway-trip\"]/div/div[1]/div[3]/div/div/div/div[2]")).click();

//      Change calendar mouth
        driver.findElement(By.xpath("//*[@id=\"dp_widget_container\"]/div[3]/div[2]/table[2]/thead/tr[1]/th[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"dp_widget_container\"]/div[3]/div[2]/table[2]/thead/tr[1]/th[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"dp_widget_container\"]/div[3]/div[2]/table[1]/tbody/tr[3]/td[2]/div/span")).click();

//      Change Travelers
        driver.findElementById("oneway-traveler").click();
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[1]/div[2]/div[2]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[1]/div[4]/div[2]/div[3]/button")).click();

//      Change Cabin Class
        driver.findElement(By.xpath("//*[@id=\"traveller-widget\"]/div/div[2]/div[2]/div/ul/li[3]")).click();
        driver.findElementByClassName("show-all").click();
    }

    public void multyCity(String from, String to, String fromSecond, String toSecond) {

//      Click to multyCity
        driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div/div[2]/div[1]/div[1]/div[3]/a")).click();

//      Clear inputs
        driver.findElementByXPath("//*[@id=\"multicity-trip\"]/div/div[1]/div[1]/div[1]/div[1]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"multicity-trip\"]/div/div[1]/div[1]/div[1]/div[3]/div/input").clear();

//      Field From
        driver.findElementByXPath("//*[@id=\"multicity-trip\"]/div/div[1]/div[1]/div[1]/div[1]/div/input").sendKeys(from);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementById("searchSelected").click();

//      Field To
        driver.findElement(By.xpath("//*[@id=\"multicity-trip\"]/div/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys(to);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"row-1\"]/div[1]/div[3]/div/div/div/div[1]")).click();

//      Add and delete New Flight
        driver.findElementByClassName("add-city").click();
        driver.findElementByClassName("add-city").click();
        driver.findElementByClassName("add-city").click();
        driver.findElementByXPath("//*[@id=\"row-3\"]/div[3]").click();
        driver.findElementByXPath("//*[@id=\"row-3\"]/div[3]").click();

//      Field FromSecond
        driver.findElementByXPath("//*[@id=\"row-2\"]/div[1]/div[1]/div/input").sendKeys(fromSecond);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"row-2\"]/div[1]/div[1]/div/div/div/div[1]").click();

//      Field ToSecond
        driver.findElementByXPath("//*[@id=\"row-2\"]/div[1]/div[3]/div/input").sendKeys(toSecond);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"row-2\"]/div[1]/div[3]/div/div/div/div[1]").click();

//      Change calendar date
        driver.findElementByXPath("//*[@id=\"row-2\"]/div[2]/div[2]/div[4]/div[2]/table[2]/tbody/tr[2]/td[1]/div/span").click();

//      Button
        driver.findElementByClassName("show-all").click();

    }
}
