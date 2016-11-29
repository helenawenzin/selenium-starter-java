package se.bettercode.seleniumstarter;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoggedInTests {

    private static WebDriver driver;
    public static NokController nokController;

    @BeforeClass
    public static void startBrowserAndGoToNok() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        nokController = new NokController(driver);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

    @Before
    public void before(){
        driver.get("http://www.nok.se/loggain");

        nokController.getEmailElement().sendKeys("Test.Larare@nok.se");
        nokController.getPasswordElement().sendKeys("testLarare");
        nokController.getLoginButtonElement().click();

        assertEquals("Mina sidor - Natur och Kultur", driver.getTitle());
    }


    @Test
    //@Ignore
    public void openNokFlex() throws InterruptedException {

        nokController.getNokFlexProduct().click();

    }

    @Test
    public void openAllServicesOnMyPages() {

        List<WebElement> list = nokController.getListOfServicesFromMyPages();
        for(WebElement element: list) {
            element.click();
        }
    }

}
