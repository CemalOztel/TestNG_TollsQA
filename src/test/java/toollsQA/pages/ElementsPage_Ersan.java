package toollsQA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import toollsQA.utilities.BrowserUtils;
import toollsQA.utilities.Driver;

public class ElementsPage_Ersan extends BasePage {

    DashBoardPage dashBoardPage;

    @FindBy(id = "userName")
    public WebElement FullName;

    @FindBy(id = "userEmail")
    public WebElement Email;

    @FindBy(id = "currentAddress")
    public WebElement currentAdress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(className = "rct-icon rct-icon-expand-all")
    public WebElement expendAllBtn;

    @FindBy(id = "yesRadio")
    public WebElement yesRadioBtn;

    @FindBy(id = "impressiveRadio")
    public WebElement impressiveRadioBtn;

    @FindBy(id = "noRadio")
    public WebElement noRadioBtn;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement selectedRadiocheck;


    public void ElementsAssert(String SubTitle) {

        WebElement element = Driver.get().findElement(By.xpath("//div[text()='" + SubTitle + "']"));
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(), SubTitle, "Verify that Elements subpage is " + SubTitle);
    }
}
