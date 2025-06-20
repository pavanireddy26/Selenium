package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09 {

    @Test(description = "Open the URL")
    public void test_selenium09() {


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        //Assertj validation
        Assert.assertEquals(driver.getCurrentUrl() , "https://www.google.com/");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");


        driver.quit();












}}
