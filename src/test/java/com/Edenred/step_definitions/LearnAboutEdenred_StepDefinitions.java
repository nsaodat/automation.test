package com.Edenred.step_definitions;

import com.Edenred.pages.EdenredPage;
import com.Edenred.utilities.BrowserUtils;
import com.Edenred.utilities.ConfigurationReader;
import com.Edenred.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LearnAboutEdenred_StepDefinitions {

    EdenredPage edenredPage = new EdenredPage();


    @Given("the user is on Edenred homepage")
    public void the_user_is_on_edenred_homepage() {
        String url = ConfigurationReader.getProperty("edenred.url");
        Driver.getDriver().get(url);
        BrowserUtils.sleep(2);
        edenredPage.acceptButtonForCookies.click();
    }

    @When("the user selects {string}")
    public void the_user_selects(String option) {
        if (option.equalsIgnoreCase("Learn more about us")) {
            edenredPage.learnMoreAboutUs.click();
        } else {
            throw new UnsupportedOperationException("Option '" + option + "' does not exist.");
        }
    }

    @Then("the user should see the Company section on navigation bar")
    public void user_should_see_the_company_on_navigation_bar() {
        edenredPage.company.click();

        BrowserUtils.sleep(3);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 700)");
        }
        BrowserUtils.sleep(1);


        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, -700)");
        }
    }

    @Then("the user sees {string}")
    public void user_sees_the(String expectedValues) {
        WebElement ourValues = edenredPage.ourValues;

        String actualValue = ourValues.getText();
        Assert.assertTrue("The 'Our values' element should contain the expected value", actualValue.contains(expectedValues));

    }
}

