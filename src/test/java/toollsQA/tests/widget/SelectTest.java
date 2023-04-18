package toollsQA.tests.widget;
import org.testng.annotations.Test;
import toollsQA.pages.WidgetsPage;
import toollsQA.tests.TestBase;
import toollsQA.utilities.BrowserUtils;



public class SelectTest extends TestBase {
    WidgetsPage widgetsPage = new WidgetsPage();

    @Test
    public void Test1() {

        BrowserUtils.clickWithJS(widgetsPage.widgetsBtn);
       widgetsPage.navigateToSubmenu("Select Menu");

        widgetsPage.selectValue.click();
        widgetsPage.grp2secim1.click();
        widgetsPage.selectTitle.click();
        widgetsPage.selectProf.click();

        widgetsPage.selectRandom(widgetsPage.colorList);

        BrowserUtils.clickWithJS(widgetsPage.colorList);

        widgetsPage.multiSelect.click();
        widgetsPage.multiSelectDropDown("Blue");
        widgetsPage.multiSelectDropDown("Black");
        widgetsPage.multiSelectDropDown("Red");
        widgetsPage.multiSelectDropDown("Green");

        widgetsPage.selectRandom(widgetsPage.carsList);


    }


}
