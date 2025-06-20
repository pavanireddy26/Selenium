package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestSelenium03 {


    @Test(description = "Open the App.vwo.com and get the title")
    public void testSelenium03() {

        //Selenium 3
        //you need to setup the Driver(browser)
        //System.getProperty("weddriver.gecko.driver","/path/gecdriver)


        //selenium 4
        //selenium manager - utility - which can download the driver automatically
        //start and stop itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.quit();









    }













}
