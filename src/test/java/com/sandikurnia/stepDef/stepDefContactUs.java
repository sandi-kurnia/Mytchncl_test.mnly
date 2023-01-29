package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.contactusPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertTrue;

public class stepDefContactUs extends testBase {

    contactusPage contactus;

    @Given("User go to {string}")
    public void userGoTo(String arg0) {
        initialization();
        contactus = new contactusPage();
    }

    @When("User in {string} page")
    public void userInPage(String arg0) {
        contactus.userInContactUsPage();


    }

    @And("User choose select value {string}")
    public void userChooseSelectValue(String arg0) {
        contactus.userClickContactUsButton();
    }

    @And("user fills all the text field")
    public void userFillsAllTheTextField() throws Exception {
        contactus.userClickFirstNameField();
        contactus.userInputFirstName();
        contactus.userClickLastNameField();
        contactus.userInputLastName();
        contactus.userClickEmailField();
        contactus.userInputEmail();
        contactus.userClickPhoneNumber();
        contactus.userInputPhoneNumber();
        contactus.userClickServicesDropDownBtn();
        contactus.userSelectAppsAndCloud();
        contactus.userClickYourMessageField();
        contactus.userInputMessage();

    }

    @Then("User success submit form")
    public void userSuccessSubmitForm() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 3);

        contactus.userClickSubmitFormButton();

        contactus.popUpMessageAppears();
        //OR
        WebElement popUp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Thank you for your message. We will get in touch with you shortly')]")));
        assertTrue(popUp.isDisplayed());

        String getTextPopUp = popUp.getText();
        System.out.println(""+getTextPopUp);

        driver.quit();
    }

}
