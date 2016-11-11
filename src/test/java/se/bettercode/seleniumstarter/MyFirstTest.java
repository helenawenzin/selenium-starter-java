package se.bettercode.seleniumstarter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void trySomething(){

        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://www.nok.se");

        assertEquals("Natur & Kultur - Natur och Kultur", driver.getTitle());
    }

}
