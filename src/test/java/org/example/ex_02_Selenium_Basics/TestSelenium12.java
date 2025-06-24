package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium12 {


    @Test(description = "Open the URL")
    public void test_selenium12() throws Exception {


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        //Navigation Commands

        //driver.get("url") -->Navigate to a Url

        // Navigate methods

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();


        Thread.sleep(5000);

    driver.quit();
    }
}