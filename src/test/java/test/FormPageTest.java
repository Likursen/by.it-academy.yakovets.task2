package test;

import org.junit.Assert;
import org.junit.Test;
import page.FormPage;
import page.field.Gender;
import page.field.Label;

public class FormPageTest extends AbstractTest {
    private final FormPage formPage = new FormPage();

    @Test
    public void enterFirstnameTest() {
        String validFirstname = "Peter";
        String firstnameFieldValue = formPage.enterFirstname(validFirstname)
                .getFirstnameFieldValue();
        Assert.assertEquals(validFirstname, firstnameFieldValue);
    }

    @Test
    public void enterLastnameTest() {
        String validLastname = "Ivanov";
        String lastnameFieldValue = formPage.enterLastname(validLastname)
                .getLastnameFieldValue();
        Assert.assertEquals(validLastname, lastnameFieldValue);
    }

    @Test
    public void genderChooseTest() {
        boolean genderChoose = formPage.chooseGender(Gender.MALE)
                .isGenderChoose(Gender.MALE);
        Assert.assertTrue(genderChoose);
    }

    @Test
    public void firstnameLabelTest() {
        boolean inputLabelCorrect = formPage.isInputLabelCorrect(Label.FIRSTNAME);
        Assert.assertTrue(inputLabelCorrect);
    }

    @Test
    public void lastnameLabelTest() {
        boolean inputLabelCorrect = formPage.isInputLabelCorrect(Label.LASTNAME);
        Assert.assertTrue(inputLabelCorrect);
    }

    @Test
    public void genderLabelTest() {
        boolean b = formPage.isGenderLabelCorrect();
        Assert.assertTrue(b);
    }

    @Test
    public void submitButtonLabelTest() {
        boolean submitButtonValueCorrect = formPage.isSubmitButtonValueCorrect();
        Assert.assertTrue(submitButtonValueCorrect);
    }
}