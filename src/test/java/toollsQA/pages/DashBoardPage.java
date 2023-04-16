package toollsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import toollsQA.utilities.BrowserUtils;
import toollsQA.utilities.Driver;



public class DashBoardPage extends BasePage{




    public void navigateBaseMenu(String menu){
        WebElement element= Driver.get().findElement(By.xpath("//h5[text()='"+menu+"']"));
        //element.click();
        BrowserUtils.clickWithJS(element);

    }
    public  void navigateSubMenu(String SubMenu){
    WebElement subelement= Driver.get().findElement(By.xpath("//span[text()='"+SubMenu+"']"));
    //subelement.click();
BrowserUtils.clickWithJS(subelement);
}
}
