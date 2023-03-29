import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.Constants.PAGE_TITLE;
import static constants.Constants.URL;

public class SimpleTests extends BaseTest{


    @Test
    public void checkUrl() {
        Assert.assertEquals(homePage.getCurrentUrl(), URL, "Actual and current URL are different");
    }

    @Test
    public void checkPageTitle(){
        Assert.assertEquals(homePage.getPageTitle(), PAGE_TITLE, "Actual page title and current are different");
    }


}
