package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class TestSelenium10_MiniProject {

        @Test(description = "Open the URL")
        public void test_selenium010() throws Exception {

            WebDriver driver = new EdgeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.manage().window().maximize();


            if (driver.getPageSource().contains("CURA Healthcare Service")) {
                System.out.println("CURA Healthcare Service is visible");
                Assert.assertTrue(true);
            } else {

              // Assert.assertTrue(false);

             throw new Exception("CURA Healthcare Service is not visible");
            }
            driver.quit();
        }
    }























