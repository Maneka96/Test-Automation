package com.enhanzer.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    //xpath of Forms Menu
    @FindBy(xpath = "//*[text()='Forms']")
    public WebElement formsMenu;


    //xpath of Practice Form Menu
    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormMenu;

    //xpath of Gender
    @FindBy(xpath = "//input[@id='gender-radio-2']")
    public WebElement gender;

    //xpath of DatePicker
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dob;

    //xpath of DatePicker
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement datePicker;

    //xpath of Date
    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--012 react-datepicker__day--selected']")
    public WebElement date;

    //xpath of hobbies-sports
    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    public WebElement sports;

    //xpath of hobbies-music
    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
    public WebElement music;

    //xpath of picture
    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement picture;

    //xpath of state
    @FindBy(xpath = "//div[@id='state']")
    public WebElement state;

    //xpath of city
    @FindBy(xpath = "//div[@id='city']")
    public WebElement city;

    //Xpath of submit button
    @FindBy(xpath = "//input[@id='submit']")
    public WebElement submitButton;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
