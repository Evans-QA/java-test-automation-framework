package com.framework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstUITest {

   static WebDriver driver;

    @BeforeAll
    static void setup() {
        ChromeOptions options = new ChromeOptions().addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    void userNicknameIsCorrect() {
        driver.get("https://github.com/Evans-QA");
        String actualUserName = driver.findElement(By.className("p-nickname")).getText();
        assertEquals("Evans-QA", actualUserName);
    }

    @Test
    void repositoryLinkIsClickable() {
        driver.get("https://github.com/Evans-QA");
        driver.findElement(By.className("repo")).click();
        // Add assertion here
    }

    @AfterAll
    static void tearDown() {
        driver.quit(); // This keeps my computer clean!
    }
}
