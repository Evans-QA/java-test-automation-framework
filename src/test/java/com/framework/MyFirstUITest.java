package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyFirstUITest {

    @Test
    void userNameIsCorrectOnOverviewTab() {


        // Arrange
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String user = "Evans-QA";
        driver.get("https://github.com/" + user);

        // Act
        String actualUserName = driver.findElement(By.className("p-nickname")).getText();


        // Assert
        Assertions.assertEquals(user, actualUserName);

        driver.quit();

    }
}
