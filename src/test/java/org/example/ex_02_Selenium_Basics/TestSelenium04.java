package org.example.ex_02_Selenium_Basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class TestSelenium04 {
    public static void main(String[] args) {

        //Webdriver hierarchy

        //searchContext(I) -> (2) - >webDriver(I) (10) ->RemoteWebDriver(c) (15)
        //ChromiumDriver(c) 25 ->EdgeDriver(c) (45)


        //searchContext(Interface)
        // webDriver(Interface )
        // RemoteWebDriver(class)
        //ChromiumDriver(class) -opensource project
        // ChromeDriver(chrome
        // EdgeDriver(class) created from chromiumdriver
        //BraveBrowser(c)


        //searchContext(Interface)- findElements and findElement -GGF
        // webDriver(Interface ) -some incomplete fumnctions-Gf
        // RemoteWebDriver(class)- It als has some functions -F
        //ChromiumDriver(class) -opensource project
        // ChromeDriver , FireFoxDiver,EdgeDriver,SafariDriver,InternetExplorerDriver- son


        // SearchContext driver = new ChromDriver();
        // SearchContext driver1 = new EdgeDriver();
        // SearchContext driver2 = new FirefoxDriver();
        // SearchContext driver3 = new InternetExplorerDriver();


        // WebDriver driver =new ChromeDriver();
        //RemoteDriver driver1 =new ChromeDriver();
        //ChromeDriver driver2 = new ChromeDriver();




        //we use based on scenario


        //Scenario

        // 1. Do want to run on Chrome or Edge ?
         //ChromeDriver driver = new ChromeDriver();


        // 2. Do you want to run on chrome then change to Edge?
         WebDriver driver = new ChromeDriver();
       //  driver = new EdgeDriver(); -- 97%
      //  drier = new FireforDriver(); --97%



        //3 . do you want to run on multiple browser .aws machine ? --2%
        //RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)
































































    }


}
