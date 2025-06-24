package org.example.ex_02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_project_2_katalon {


    @Test(description = "Verify that with valid email, pass,login")
    public void test_positive() throws Exception {


        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        //driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.id("txt-username"));
        emailInputBox.sendKeys("John Doe");
//<input type="text" class="form-controhttps://katalon-demo-cura.herokuapp.com/l" id="txt-username" name="username" placeholder="Username" value="" autocomplete="off">


        WebElement passwordInputBox = driver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("ThisIsNotAPassword");



        WebElement loginbtn = driver.findElement(By.id("btn-login"));
        loginbtn.click();


      Thread.sleep(3000);
      driver.quit();












    }
}