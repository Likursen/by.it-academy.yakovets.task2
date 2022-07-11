package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.SingletonWebDriver;

public abstract class AbstractPage {
    public final WebDriver webDriver = SingletonWebDriver.getWebDriver();

    protected void enterStringValue(By locator, String text) {
        webDriver.findElement(locator)
                .sendKeys(text);
    }

    protected String getElementValue(By locator) {
        return webDriver.findElement(locator)
                .getAttribute("value");
    }

    protected String getElementText(By locator) {
        return webDriver.findElement(locator)
                .getText();
    }
}