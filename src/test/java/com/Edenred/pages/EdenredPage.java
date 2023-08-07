package com.Edenred.pages;

import com.Edenred.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class EdenredPage {

    public EdenredPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement company;

    @FindBy(xpath = "//button[.='Accept']")
    public WebElement acceptButtonForCookies;

    @FindBy(xpath = "(//a[@href='/en/company/'])[2]")
    public WebElement learnMoreAboutUs;

    @FindBy (xpath = "//main[@id='main']/section[3]/div[2]/div/div/h2[contains(text(), 'values')]")
    public WebElement ourValues;

}