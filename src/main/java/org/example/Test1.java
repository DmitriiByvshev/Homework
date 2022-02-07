package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class Test1 {


    public static void main(String[] args ) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru/");

        driver.findElement(By.xpath(".//button[@class='nav-element__burger j-menu-burger-btn']")).click();
        driver.findElement(By.xpath(".//li[@data-menu-id='4830']/a")).click();
        driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[1]/div/div/ul[2]/li[4]/a")).click(); // xpas не очень хороший, но писать от ближайшего id далеко, а другого способа я не нашел
        driver.findElement(By.id("c46719393")).click();
        driver.findElement(By.xpath(".//div[@class='same-part-kt__btn-wrap']/button[@class='btn-main']")).click();
        driver.findElement(By.xpath(".//a[@class='navbar-pc__link']/span[@class='navbar-pc__icon navbar-pc__icon--basket']")).click();
        driver.quit();


    }

}