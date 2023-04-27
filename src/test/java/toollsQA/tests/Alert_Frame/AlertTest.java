package toollsQA.tests.Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import toollsQA.pages.Alert_FramePage;
import toollsQA.pages.DashBoardPage;
import toollsQA.tests.TestBase;
import toollsQA.utilities.BrowserUtils;


public class AlertTest extends TestBase {

    DashBoardPage dashBoardPage = new DashBoardPage();
    Alert_FramePage alert_framePage = new Alert_FramePage();

    @Test
    public void alertTest() {
        dashBoardPage.navigateBaseMenu("Alerts, Frame & Windows");
        dashBoardPage.navigateSubMenu("Alerts");
        alert_framePage.clickmebutton1.click();

        Alert alert = driver.switchTo().alert();
        //alert.accept(); //genel testi calistirdigimizda bunu koymazsak hata veriyor
        String str = alert.getText();
        System.out.println("str = " + str);
        alert.accept();

        alert_framePage.clickmebutton2.click();
        BrowserUtils.waitFor(6);
        alert.accept();

        alert_framePage.clickmebutton3.click();
        alert.dismiss();
        String expectedMessage = "You selected Cancel";
        Assert.assertEquals(alert_framePage.actualmessage.getText(), expectedMessage);

        alert_framePage.clickmebutton4.click();
        alert.sendKeys("Son Sampiyon Trabzonspor");
        alert.accept();
    }

    @Test
    public void frameTest() {
        dashBoardPage.navigateBaseMenu("Alerts, Frame & Windows");
        dashBoardPage.navigateSubMenu("Frames");
        JavascriptExecutor abc=(JavascriptExecutor)driver;
        for (int i = 0; i < 2; i++) {
            abc.executeScript("window.scrollBy(0,500)");
        }
        driver.switchTo().frame("frame1");//framin acilis tagindan locate etmemiz gerekiyor
        String expectedMessage = "This is a sample page";
        Assert.assertEquals(alert_framePage.actualmessageframe.getText(), expectedMessage);


        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        String expectedMessage1 = "This is a sample page";
        Assert.assertEquals(alert_framePage.actualmessageframe2.getText(), expectedMessage1);




    }
}
