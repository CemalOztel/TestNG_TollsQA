package toollsQA.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import toollsQA.utilities.ConfigurationReader;
import toollsQA.utilities.Driver;


import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;//extend ettigimiz icin package disindan da cagirabilmek icin protected dedik
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        actions=new Actions(driver);
        wait=new WebDriverWait(Driver.get(),15);
        driver.get(ConfigurationReader.get("url"));
//JavascriptExecutor abc =(JavascriptExecutor)driver;
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
        //Driver.closeDriver();

    }


}
