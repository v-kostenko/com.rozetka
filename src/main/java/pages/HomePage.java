package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(xpath = "//li[contains(@class,'header-actions__item--user')]//button")
    private WebElement userIcon;

    @FindBy(xpath = "//li[contains(@class,'header-actions__item--cart')]//button")
    private WebElement curtIcon;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }


}
