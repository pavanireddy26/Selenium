package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSelenium15 {

    @Test(description = "Open the URL")
    public void test_selenium12() throws Exception {


        EdgeOptions edgeOptions = new EdgeOptions();
        // FirefoxOptions, ChromeOptions , SafariDriver
//
//        EdgeOptions - It will help you set the browser
//        option to browsers
//       windows - size
//        sizeheadless mode -there is not UI -> advantage - fast executions
//        full UI mode - default -UI browser
//        incognito mode -switch
//        start max
//        add extension -browser
//        100 + other, https, http
//        localstoregare, download
//


       // edgeOptions.addArguments("--- window-size=1280,720");
         //edgeOptions.addArguments("--- window-size=800,720");
      //  edgeOptions.addArguments("incoginted");
      //  edgeOptions.addArguments("-- start--maxmimize");
        edgeOptions.addArguments("---headless"); // NO UI



        EdgeDriver driver = new EdgeDriver();

        Thread.sleep(5000);
        driver.quit();






















    }
}
