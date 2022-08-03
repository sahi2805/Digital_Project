package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.TestUtil;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class BaseClass {

   public static WebDriver driver;

    public void BaseClas1(){
        System.setProperty("WebDriver.chrome.driver","\"C:\\chromedriver.exe\"");
        driver=new ChromeDriver();
        driver.get(TestUtil.url);

      driver.manage().window().maximize();
driver.manage().deleteAllCookies();
//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_time, TimeUnit.SECONDS);
  //      driver.manage().timeouts().implicitlyWait(TestUtil.Implicite_time,TimeUnit.SECONDS);
    }
}
