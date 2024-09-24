package com.wp.testautomation101;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {

    //xpath of Elements Menu
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elementsMenu;

    //xpath of Textbox Menu
    @FindBy(xpath = "//span [text()='Text Box']")
    public WebElement textBoxMenu;

    //Xpath of Submit Button
    @FindBy(xpath = "//button  [@id='submit'] ")
    public WebElement submitButton;

    //Xpath of Check Box
    @FindBy(xpath = "//span[text() ='Check Box'] ")
    public WebElement checkBoxMenu;

    //Xpath of Expand Arrow
    @FindBy(xpath = "//*[@id='tree-node']/ol/li/span/button ")
    public WebElement expandArrow;

    //Xpath of Desktop selection
    @FindBy(xpath = "//span[text()= 'Desktop'] ")
    public WebElement desktopClick;

    //Xpath of element radio button
    @FindBy(xpath = "//span[text() ='Radio Button'] ")
    public WebElement radioButtonMenu;

    //Xpath of  radio button
    @FindBy(xpath = "//label[@class ='custom-control-label' ]  ")
    public WebElement radioButton;

    //Xpath of  button menu
    @FindBy(xpath = "//span[text() ='Buttons'] ")
    public WebElement buttonsMenu;

    //Xpath of  widgets Menu
    @FindBy(xpath = "//h5[text() ='Widgets']")
    public WebElement widgetsMenu;

    //Xpath of  date picker
    @FindBy(xpath = "//span[text() ='Date Picker']")
    public WebElement datePicker;

    //Xpath of  Select date
    @FindBy(xpath = "//input [@id ='datePickerMonthYearInput' ]")
    public WebElement selectDate;

    //Xpath of AlertsFrameWindows
    @FindBy(xpath = "//h5[text() ='Alerts, Frame & Windows'] ")
    public WebElement AlertsFrameWindows;

    //Xpath of modal dialogs
    @FindBy(xpath = "//span[text() ='Modal Dialogs'] ")
    public WebElement modalDialogs;

    //Xpath of small modal
    @FindBy(xpath = "//button[@id='showSmallModal'] ")
    public WebElement smallModal;

    //Xpath of  close small modal
    @FindBy(xpath = "//button[@id='closeSmallModal'] ")
    public WebElement closeSmallModal;

    //Xpath of element links
    @FindBy(xpath = "//span[text() ='Links'] ")
    public WebElement Links;

    //Xpath of element links
    @FindBy(xpath = "//a[@id='simpleLink'] ")
    public WebElement HomeLink;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    }

