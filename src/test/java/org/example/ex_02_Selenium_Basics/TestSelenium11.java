package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {



        @Test(description = "Open the URL")
        public void test_selenium11() throws Exception {

            ChromeDriver driver = new ChromeDriver();
            //driver = new FirefoxDriver

            WebDriver driver1 = new EdgeDriver();
            driver1 = new FirefoxDriver();


            driver.get("");
            driver.manage().window().maximize();


        }}














