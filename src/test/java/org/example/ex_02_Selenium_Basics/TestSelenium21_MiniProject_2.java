package org.example.ex_02_Selenium_Basics;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium21_MiniProject_2 {

    // Error meassage- The email address you entered is incorrect.

    @Owner("pavani")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Verify that error message comes with invalid email gives on signup page")
    public void vwo_free_trial_error_verify() {


        EdgeDriver driver = new  EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");




        WebElement a_tag_partial_match =driver.findElement(By.partialLinkText("Start"));
        a_tag_partial_match.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));



        driver.quit();





    }
}