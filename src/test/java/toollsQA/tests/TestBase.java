package toollsQA.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import toollsQA.utilities.ConfigurationReader;
import toollsQA.utilities.Driver;


import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;

    protected ExtentTest extentLogger;
    @BeforeTest
    public void setUpTest(){
        report=new ExtentReports();

        String projectPath=System.getProperty("user.dir");

        String path=projectPath+"/test-output/report.html";
        htmlReporter= new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Eurotech smoke test");
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","Grup Sdet1");


    }
    @AfterTest
    public void tearDownTest(){
        report.flush();

    }

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
