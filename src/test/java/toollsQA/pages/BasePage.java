package toollsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import toollsQA.utilities.Driver;


public abstract class BasePage {


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+ menuName +"']")).click();
    }
    public void navigateToSubmenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+ subMenu +"']")).click();
    }

}
