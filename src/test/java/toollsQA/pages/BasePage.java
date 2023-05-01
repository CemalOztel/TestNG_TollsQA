package toollsQA.pages;

import org.openqa.selenium.support.PageFactory;
import toollsQA.utilities.Driver;


public abstract class BasePage {

public BasePage() {
            PageFactory.initElements(Driver.get(),this);
        }

}
