package com.sandikurnia.pages;

import com.sandikurnia.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class contactusPage extends testBase {

    public contactusPage(){
        driver.navigate().to("https://moonlay.com/contact-us/");
    }

    //FIELD

    By firstNameField = By.id("ff_3_names_first_name_");

    By lastNameField = By.id("ff_3_names_last_name_");

    By emailField  = By.id("ff_3_email");

    By phoneNumberField = By.id("ff_3_phone_number");

    By yourMessageField = By.id("ff_3_message");

    //BUTTON
    By contacusBtn = By.xpath("//*[contains(@class,'wpb_tabs_nav ui-tabs-nav clearfix')]//child::node()");

    By servicesDropDownBtn = By.id("select2-ff_3_dropdown-container");

    By selectServicesDropDownBtn = By.xpath("//*[contains(@class,'select2-results__options')]");
    By submitFormBtn = By.xpath("//*[contains(@type,'submit')]");

    //ASSERTION
    By popUpMessageAppears= By.xpath("//*[contains(text(),'Thank you for your message. We will get in touch with you shortly')]");


    //----------------------ACTION----------------------------\\

    public void userInContactUsPage(){
        driver.findElement(contacusBtn).isDisplayed();
    }

    public void userClickContactUsButton(){
        driver.findElement(contacusBtn).click();
    }

    public void userClickFirstNameField(){
        driver.findElement(firstNameField).click();
    }

    public void userInputFirstName(){
        driver.findElement(firstNameField).sendKeys("Sandi");
    }

    public void userClickLastNameField(){
        driver.findElement(lastNameField).click();
    }

    public void userInputLastName(){
        driver.findElement(lastNameField).sendKeys("Test");
    }

    public void userClickEmailField(){
        driver.findElement(emailField).click();
    }

    public void userInputEmail(){
        driver.findElement(emailField).sendKeys("themoreiknowthebetterwith@gmail.com");
    }

    public void userClickPhoneNumber(){
        driver.findElement(phoneNumberField).click();
    }

    public void userInputPhoneNumber(){
        driver.findElement(phoneNumberField).sendKeys("123444444");
    }

    public void userClickServicesDropDownBtn(){
        driver.findElement(servicesDropDownBtn).click();
    }


    public void userSelectAppsAndCloud() throws Exception{

        for (int i = 0; i < driver.findElements(selectServicesDropDownBtn).toArray().length; i++)
        {
            driver.findElements(selectServicesDropDownBtn).get(i).click();
            Thread.sleep(2000);
            driver.findElement(servicesDropDownBtn).click();
        }

    }

    public void userClickYourMessageField(){
        driver.findElement(yourMessageField).click();
    }

    public void userInputMessage(){
        driver.findElement(yourMessageField).sendKeys("INDONESIAN CITIZEN");
    }

    public void userClickSubmitFormButton(){
        driver.findElement(submitFormBtn).click();
    }

    public void popUpMessageAppears()throws Exception{
        driver.findElement(popUpMessageAppears).isDisplayed();
        Thread.sleep(3000);
    }

}
