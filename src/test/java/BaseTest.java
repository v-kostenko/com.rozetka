import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver(getChromeOptions());
        driver.get("https://rozetka.com.ua/ua/");
        homePage = new HomePage(driver);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        return options;
    }
}
