package org.example.ex_04_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestSelenium24_Fix_Miniproject {

    // Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as **admin@admin.com**
// Find the Pass inputbox and enter passwrod as **admin**.
// Find and Click on the submit button
// Verify that the error message is shown "Your email, password, IP address or location did not match"



        @Test(description ="Verify that with invalid email, pass, error message is shown on the app.vwo.com")
        public void test_negative_vwo_login() throws Exception {

            EdgeOptions edgeOptions = new EdgeOptions();
            // edgeOptions.addArguments("--start-maximized");

            WebDriver driver = new EdgeDriver(edgeOptions);
//        driver.navigate().to("https://app.vwo.com");
            driver.get("https://app.vwo.com");

            driver.manage().window().maximize();

            // 1. Find the email inputbox and enter the email
            // <input open Tag
            // type="email"
            // class="text-input W(100%)"
            // name="username"
            // id="login-username"
            // data-qa="hocewoqisi"
            // > close Tag
         //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement emailInputBox = driver.findElement(By.id("login-username"));
            emailInputBox.sendKeys("admin@admin.com");

            // 2. Find the password inputbox and enter the password

            // <input
            // type="password"
            // class="text-input W(100%)"
            // name="password"
            // id="login-password"
            // data-qa="jobodapuxe">


            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys("admin");


            // 3. Find the submit button and click on it.
            // <button
            // type="submit"
            // id="js-login-btn"
            // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
            // onclick="login.login(event)"
            // data-qa="sibequkica"
            // >

            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();


//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            // 4. Find the invalid error message and verify.
            // <div
            // class="notification-box-description"
            // data-qa="rixawilomi">
            // Your email, password, IP address or location did not match</div>

            //until this  notification displays or visible we have to wait for max =3 sec

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));
            WebElement error_message = driver.findElement(By.className("notification-box-description"));
          //one is enough
         //   wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));


            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

            driver.quit();


        }
    }