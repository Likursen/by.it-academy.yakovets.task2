package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static WebDriver webDriver = SingletonWebDriver.getWebDriver();
    private static final String URL = "file:C:\\src\\by.it-academy.yakovets.task2/Form.html";

    @BeforeClass
    public static void openSite() {
        webDriver.get(URL);
    }

    @AfterClass
    public static void afterTest() {
        webDriver.quit();
        webDriver = null;
    }
}