package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args )
    {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru/");

        driver.findElement(By.id("searchInput")).sendKeys("кроссовки");
        driver.findElement(By.id("applySearchBtn")).click();
        driver.findElement(By.xpath("//*[@id='filters']/div[5]/div[2]/fieldset/label[11]/span[1]")).click(); // Снова плохой xpas
        driver.quit();
    }
}
