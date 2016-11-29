package se.bettercode.seleniumstarter;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by helenawenzin on 29/11/16.
 */
public class NotLoggedInTests {

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
        driver.get("http://www.nok.se");
    }

    @Test
    public void isNokWebpageUp(){
        assertEquals("Natur & Kultur - Natur och Kultur", driver.getTitle());
    }

    @Test
    @Ignore //TODO fixa click och asserten?
    public void search() {

        nokController.getSearchElement().sendKeys("rivstart");
        nokController.getSearchElementOnCLick().click();
        assertEquals("Sök - Natur och Kultur", driver.getTitle());

    }

}
