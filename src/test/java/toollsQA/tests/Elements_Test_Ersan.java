package toollsQA.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import toollsQA.pages.BasePage;
import toollsQA.pages.DashBoardPage;
import toollsQA.pages.ElementsPage_Ersan;
import toollsQA.utilities.BrowserUtils;

public class Elements_Test_Ersan extends TestBase {
    DashBoardPage dashBoardPage=new DashBoardPage();
    ElementsPage_Ersan elementsPage_ersan=new ElementsPage_Ersan();
    Faker fake=new Faker();


    @Test
    public void TextBox() {
        dashBoardPage.navigateBaseMenu("Elements");
        dashBoardPage.navigateSubMenu("Text Box");
        elementsPage_ersan.ElementsAssert("Text Box" );
        elementsPage_ersan.FullName.sendKeys(fake.name().firstName()+fake.name().lastName());
        elementsPage_ersan.Email.sendKeys(fake.internet().emailAddress());
        elementsPage_ersan.currentAdress.sendKeys(fake.address().fullAddress());
        elementsPage_ersan.permanentAddress.sendKeys(fake.address().secondaryAddress());

        BrowserUtils.clickWithJS(elementsPage_ersan.submitBtn);

    }

    @Test
    public void CheckBox() {
       dashBoardPage.navigateBaseMenu("Elements");
       dashBoardPage.navigateSubMenu("Check Box");
       elementsPage_ersan.ElementsAssert("Check Box");
      // elementsPage_ersan.expendAllBtn.click();      locate edemedim
    }

    //Eleemnts e git
    //Radio Button tikla
    //dogru sayfada oldugunu verify et
    //her uc butonu kontrol et secili olan varsa yazdir
    //impressive butonunu sec
    //verify that "You have selected No"
    @Test
    public void RadioButtun() throws InterruptedException {
        dashBoardPage.navigateBaseMenu("Elements");
        dashBoardPage.navigateSubMenu("Radio Button");
        elementsPage_ersan.ElementsAssert("Radio Button");
        BrowserUtils.clickWithJS(elementsPage_ersan.yesRadioBtn);

        if (elementsPage_ersan.yesRadioBtn.isSelected()) {
            System.out.println("Yes Butonu secili");
        }
        else if (elementsPage_ersan.impressiveRadioBtn.isSelected()) {
            System.out.println("Impressive Radio Buton Secili");
        }
           else if (elementsPage_ersan.noRadioBtn.isSelected()) {
            System.out.println("No Butonu secili ");
        }
            else { System.out.println("Hicbir buton secili degil"); }

            BrowserUtils.clickWithJS(elementsPage_ersan.impressiveRadioBtn);
        System.out.println(elementsPage_ersan.selectedRadiocheck.getText());
        Assert.assertEquals(elementsPage_ersan.selectedRadiocheck.getText(),"Impressive","Verify that Impressive baton is selected");
    }
}
