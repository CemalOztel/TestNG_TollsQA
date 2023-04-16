package toollsQA.tests.Alert_Frame;

import org.testng.annotations.Test;
import toollsQA.pages.AlertPage;
import toollsQA.pages.DashBoardPage;
import toollsQA.tests.TestBase;


public class AlertTest extends TestBase {

    DashBoardPage dashBoardPage = new DashBoardPage();
    AlertPage alertPage = new AlertPage();

    @Test
    public void alert() {
        dashBoardPage.navigateBaseMenu("Alerts, Frame & Windows");
        dashBoardPage.navigateSubMenu("Alerts");
        alertPage.alertbtn.click();

        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        String str = alert.getText();
        System.out.println("str = " + str);
        alert.accept();

    }
}
