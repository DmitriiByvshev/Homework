package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Test3 {


    public static void main(String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru/catalog/9842676/detail.aspx");

        driver.findElement(By.xpath(".//div[@id='infoBlockProductCard']/div[@class='same-part-kt__order']/div/button[@class='btn-main']")).click();
        Thread.sleep(1000); //почему-то другой вариант явного ожидания у меня не работает в этом месте.
        driver.findElement(By.xpath(".//a[@class='navbar-pc__link']/span[@class='navbar-pc__icon navbar-pc__icon--basket']")).click();
        driver.findElement(By.xpath(".//button[@class='btn__del j-basket-item-del']")).click();
        driver.quit();
    }


}

