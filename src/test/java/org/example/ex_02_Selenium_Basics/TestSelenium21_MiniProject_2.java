package org.example.ex_02_Selenium_Basics;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class TestSelenium21_MiniProject_2 {
    // Error message- The email address you entered is incorrect.
    @Owner("pavani")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Verify that error message comes with invalid email gives on signup page")
    public void vwo_free_trial_error_verify() {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com");
        System.out.println(driver.getCurrentUrl());

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("Start"));
        a_tag_partial_match.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement check_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        check_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");
        driver.quit();
    }
}