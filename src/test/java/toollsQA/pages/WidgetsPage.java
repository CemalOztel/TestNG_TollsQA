package toollsQA.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import toollsQA.utilities.BrowserUtils;
import toollsQA.utilities.Driver;

import java.util.List;

public class WidgetsPage extends BasePage {

    @FindBy(xpath = "//h5[text()='Widgets']")
    public WebElement widgetsBtn;

    @FindBy(xpath = "//div[text()='Select Option']")
    public WebElement selectValue;

    @FindBy(xpath = "//div[text()='Group 2, option 1']")
    public WebElement grp2secim1;

    @FindBy(id = "oldSelectMenu")
    public WebElement colorList;

    @FindBy(id = "cars")
    public WebElement carsList;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[3]")
    public WebElement multiSelect;

    @FindBy(xpath = "//div[text()='Select Title']")
    public WebElement selectTitle;
    @FindBy(xpath = "//div[text()='Prof.']")
    public WebElement selectProf;


    public void selectRandom(WebElement element) {
        Select selectMenu = new Select(element);
        List<WebElement> elements = selectMenu.getOptions();

        int randomSelect = (int) (Math.random() * elements.size());
        selectMenu.selectByIndex(randomSelect);


    }

    public void multiSelectDropDown(String  selectName) {

        Driver.get().findElement(By.xpath("//div[text()='" + selectName + "']")).click();

    }
}
//select güncel