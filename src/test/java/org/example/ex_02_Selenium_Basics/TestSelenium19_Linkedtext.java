package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium19_Linkedtext {
    @Test(description = "Verify vwo")
    public void test_login_vwo(){

        EdgeOptions edgeOptions = new EdgeOptions();

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();


        WebElement a_tag_free_trail_match = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trail_match.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();













    }
























}
