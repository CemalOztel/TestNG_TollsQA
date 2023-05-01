package toollsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import toollsQA.utilities.Driver;




public BasePage() {
            PageFactory.initElements(Driver.get(),this);
        }

    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+ menuName +"']")).click();
    }
    public void navigateToSubmenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+ subMenu +"']")).click();
    }

}
