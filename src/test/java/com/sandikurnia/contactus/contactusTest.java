package com.sandikurnia.contactus;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.contactusPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class contactusTest extends testBase {

    contactusPage contactus;

    public contactusTest(){
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        contactus = new contactusPage();
    }

    @Test(priority =  0)
    public void User_Submit_Contact_Us_By_Input_All_Required_Fields() throws Exception {
        contactus.userClickContactUsButton();
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
        contactus.userClickSubmitFormButton();
        contactus.popUpMessageAppears();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
