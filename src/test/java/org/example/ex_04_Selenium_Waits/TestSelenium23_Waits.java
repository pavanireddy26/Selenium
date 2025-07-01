package org.example.ex_04_Selenium_Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium23_Waits {


    @Test(description = "Verify Ebay Print the Price (iMac)")
    public void test_Verify_Print_imac_price() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();


        try {
            Thread.sleep(3000);    // JVM  to hold
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
