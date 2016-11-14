package se.bettercode.seleniumstarter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    WebDriver driver;

    @Before
    public void startBrowserAndGoToNok() {

        driver = new HtmlUnitDriver();
        driver.get("http://www.nok.se");
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void trySomething(){

        startBrowserAndGoToNok();
        assertEquals("Natur & Kultur - Natur och Kultur", driver.getTitle());
    }

    @Test
    public void checkLoginButton() {

        startBrowserAndGoToNok();

        driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphContentRegion_uContentArea_ctl00_lbLogin"));

    }

    @Test
    public void login() throws InterruptedException {

        startBrowserAndGoToNok();

        WebElement id = driver.findElement(By.name("ctl00$cphTotalRegion$cphWrapperRegion$cphContentRegion$uContentArea$ctl00$txtCheckoutUserName"));
        WebElement pass = driver.findElement(By.name("ctl00$cphTotalRegion$cphWrapperRegion$cphContentRegion$uContentArea$ctl00$txtCheckoutPassword"));
        WebElement loginButton =  driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphContentRegion_uContentArea_ctl00_lbLogin"));

        id.sendKeys("Test.Larare@nok.se");
        pass.sendKeys("testLarare");
        loginButton.click();
    }

}
