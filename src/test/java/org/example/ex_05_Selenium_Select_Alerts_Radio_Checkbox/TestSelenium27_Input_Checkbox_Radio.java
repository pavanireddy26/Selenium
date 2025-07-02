package org.example.ex_05_Selenium_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium27_Input_Checkbox_Radio {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().window().maximize();


        driver.findElement(By.name("firstname")).sendKeys("pavani");

        //RadioButtons



        driver.findElement(By.id("sex-1")).click();

        //checkBox

        driver.findElement(By.id("tool-1")).click();














    }
}
