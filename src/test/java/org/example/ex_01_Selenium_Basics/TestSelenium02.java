package org.example.ex_01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test(description = "Open the app.vwo.com and verify the title")

    public void test_Selenium02() {
        //opebn the url


        EdgeDriver driver = new EdgeDriver();
        // new EdgeDriver();  -> POST Request (local host:56055), create session endpoint

        //Navigate the url

        driver.get("https://app.vwo.com");


        //Asssert thr url  - Validation -TestNg asserations


        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.quit();
    }


}
