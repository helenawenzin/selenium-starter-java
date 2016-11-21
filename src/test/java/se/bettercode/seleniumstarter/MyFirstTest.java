package se.bettercode.seleniumstarter;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

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
        driver.get("http://www.nok.se");
    }

    @Test
    public void trySomething(){
        assertEquals("Natur & Kultur - Natur och Kultur", driver.getTitle());
    }

    @Test
    public void checkLoginButton() {
        driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphContentRegion_uContentArea_ctl00_lbLogin"));
    }

    @Test
    public void login() throws InterruptedException {

        nokController.getEmailElement().sendKeys("Test.Larare@nok.se");
        nokController.getPasswordElement().sendKeys("testLarare");
        nokController.getLoginButtonElement().click();

        assertEquals("Mina sidor - Natur och Kultur", driver.getTitle());
    }

    @Test
    public void search() {

        nokController.getSearchElement().sendKeys("rivstart");
        
    }


}
