package org.example.ex_02_Selenium_XPATH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestSelenium22_miniproject_3_katalon_mini_Xpath {

    @Test(description = "Verify that with valid email, pass,login,appoinment page is loaded")
    public void test_positive() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");

        driver.manage().window().maximize();

        WebElement appoinment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        appoinment_btn.click();
//       WebElement username_input_box = driver.findElement(By.xpath("//input[@name='username']"));
//        username_input_box.sendKeys("John Doe");

        List<WebElement> username_input_box_Xpath_Placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_Xpath_Placeholder.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        button.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
}}
