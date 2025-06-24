package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestSelenium14 {


        @Test(description = "Open the URL")
        public void test_selenium12() throws Exception {


            WebDriver driver = new EdgeDriver();
            driver.get("https://google.com");



         Thread.sleep(5000);
         driver.close();

         //close - will the close the current tab , not the session (not the all tabs)
         // session id = not null

            driver.quit();
            //It will  close all the tabs - session id = null


















        }}
