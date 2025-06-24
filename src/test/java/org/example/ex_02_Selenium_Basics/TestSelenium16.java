package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium16 {

    @Test(description = "Open the URL")
    public void test_selenium12() throws Exception {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---windows-size=1920,1080");

    //    edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex02_Selenium_Basics/adblock1.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");




// driver.manage().deleteAllCookies();



























    }
    }
