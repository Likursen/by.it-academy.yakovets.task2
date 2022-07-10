package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTest {
    private static final WebDriver WEB_DRIVER = SingletonWebDriver.getWebDriver();
    private static final String URL = "file:C:\\src\\by.it-academy.yakovets.task2/Form.html";

    @BeforeClass
    public static void openSite() {
        WEB_DRIVER.get(URL);
    }

    @AfterClass
    public static void webDriverClose() {
        SingletonWebDriver.driverQuit();
    }
}