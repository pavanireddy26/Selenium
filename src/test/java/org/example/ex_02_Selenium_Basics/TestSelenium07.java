package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {




    @Test(description = "Open the URL")
    public void test_selenium07() {

      WebDriver driver = new EdgeDriver();
      driver.get("https://google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    driver.quit();
    }
}
