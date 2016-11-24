package se.bettercode.seleniumstarter;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

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
    }

    @Test
    public void trySomething(){
        assertEquals("NoK", driver.getTitle());
    }

    @Test
    public void login() throws InterruptedException {

        nokController.getEmailElement().sendKeys("Test.Larare@nok.se");
        nokController.getPasswordElement().sendKeys("testLarare");
        nokController.getLoginButtonElement().click();

        assertEquals("Mina sidor - Natur och Kultur", driver.getTitle());
    }

    @Test
    @Ignore
    public void search() {

        nokController.getSearchElement().sendKeys("rivstart");

    }


}
