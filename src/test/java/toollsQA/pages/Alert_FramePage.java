package toollsQA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alert_FramePage extends BasePage{
    @FindBy(id = "alertButton")
    public WebElement clickmebutton1;
    @FindBy(id = "timerAlertButton")
    public WebElement clickmebutton2;
    @FindBy(id = "confirmButton")
    public WebElement clickmebutton3;
    @FindBy(id = "confirmResult")
    public WebElement actualmessage;
    @FindBy(id = "promtButton")
    public WebElement clickmebutton4;
    @FindBy(id = "sampleHeading")
    public WebElement actualmessageframe;
    @FindBy(id = "sampleHeading")
    public WebElement actualmessageframe2;
}
