package com.sandikurnia.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumberContactus.json",
                "html:target/cucumber-reports/contactusReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "/Users/sandikurnia/Documents/sandikurnia_moonlayTechnicalTest/src/test/resources/features/contactus.feature",
        glue = {"com/sandikurnia/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@ContactUs-Feature"
)

public class testRunner extends AbstractTestNGCucumberTests {

}
