package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test4 {

    public static void main( String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru/");

        driver.findElement(By.xpath(".//a[@class='navbar-pc__link j-main-login']")).click();
        driver.findElement(By.xpath(" .//input[@class='input-item']")).click();
        driver.findElement(By.xpath(" .//input[@class='input-item']")).sendKeys("9996665522");
        driver.findElement(By.id("requestCode")).click();
        driver.quit();
    }


}

