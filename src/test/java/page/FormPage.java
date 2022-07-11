package page;

import org.openqa.selenium.By;
import page.field.Gender;
import page.field.Label;
import utils.Utils;

public class FormPage extends AbstractPage {
    private final By firstnameInputLocator = By.xpath("//input[@name='firstname']");
    private final By lastnameInputLocator = By.xpath("//input[@name='lastname']");
    private final By genderLabelLocator = By.xpath("//label[text()='Пол']");
    private final By submitButtonLocator = By.xpath("//input[@type='submit']");

    public FormPage enterFirstname(String firstname) {
        enterStringValue(firstnameInputLocator, firstname);
        return this;
    }

    public String getFirstnameFieldValue() {
        return getElementValue(firstnameInputLocator);
    }

    public FormPage enterLastname(String lastname) {
        enterStringValue(lastnameInputLocator, lastname);
        return this;
    }

    public String getLastnameFieldValue() {
        return getElementValue(lastnameInputLocator);
    }

    public FormPage chooseGender(Gender gender) {
        String xpathValue = gender.getXpathValue();
        String genderXpathPattern = "//input[@name='gender' and @value='%s']";
        String xpath = String.format(genderXpathPattern, xpathValue);
        webDriver.findElement(By.xpath(xpath))
                .click();
        return this;
    }

    public boolean isInputLabelCorrect(Label label) {
        String xpathValue = label.getXpathValue();
        String labelXpathPattern = "//label[@for='%s']";
        String xpath = String.format(labelXpathPattern, xpathValue);
        return Utils.isElementDisplayed(webDriver, By.xpath(xpath));
    }

    public boolean isGenderLabelCorrect() {
        String elementText = getElementText(genderLabelLocator);
        return elementText.equals("Пол");
    }

    public boolean isSubmitButtonValueCorrect() {
        String elementText = getElementValue(submitButtonLocator);
        return elementText.equals("Заказать");
    }

    public boolean isGenderChoose(Gender gender) {
        String xpathValue = gender.getXpathValue();
        String genderXpathPattern = "//input[@name='gender' and @value='%s']";
        String xpath = String.format(genderXpathPattern, xpathValue);
        return webDriver.findElement(By.xpath(xpath))
                .isSelected();
    }
}