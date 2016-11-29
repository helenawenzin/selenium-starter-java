package se.bettercode.seleniumstarter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NokController {

    private WebDriver driver;

    public NokController(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailElement() {
        return driver.findElement(By.id("txtCheckoutUserName"));
    }

    public WebElement getPasswordElement() {
        return driver.findElement(By.id("txtCheckoutPassword"));
    }

    public WebElement getLoginButtonElement() {
        return driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphContentRegion_cphOuterMainContentRegion_ctl00_lbLogin"));
    }

    public WebElement getSearchElement() {
        return driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphHeaderRegion_uHeader_uTopMenu_ctl00_txtSearch"));
    }

    public WebElement getNokFlexProduct() {
        return driver.findElement(By.cssSelector("img[title=\"Matematik 5000 1a Röd NOKflex Lärare\"]"));

    }

    public WebElement getSearchElementOnCLick() {
        return driver.findElement(By.id("ctl00_cphTotalRegion_cphWrapperRegion_cphHeaderRegion_uHeader_uTopMenu_ctl00_lnkSearch"));
    }

    public List<WebElement> getListOfServicesFromMyPages() {
        List<WebElement> list = driver.findElements(By.partialLinkText("ÖPPNA"));;
        return list;
    }
}
