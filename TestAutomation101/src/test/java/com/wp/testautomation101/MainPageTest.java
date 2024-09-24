package com.wp.testautomation101;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");

       mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testcase01() {

        //Scroll the page
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Navigate on the element menu
        mainPage.elementsMenu.click();

        //Click on the textbox menu
        mainPage.textBoxMenu.click();

        //Enter Full name
        WebElement fullName = driver.findElement(By.xpath("//input [@id='userName']"));
        fullName.sendKeys("John Doe");

        //Enter Email
        WebElement email = driver.findElement(By.xpath("//input [@id='userEmail']"));
        email.sendKeys("john@example.com");

        //Enter Current Address
        WebElement currentAddress = driver.findElement(By.xpath("//textarea [@id='currentAddress']"));
        currentAddress.sendKeys("123 Street,City");

        //Enter Permanent Address
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea  [@id='permanentAddress'] "));
        permanentAddress.sendKeys("456 Avenue,City");

        //Click on submit button
        mainPage.submitButton.click();

        // Validate fields
        WebElement validateFullName = driver.findElement(By.xpath("//p[@id='name']"));
        assertEquals(validateFullName.getText(), "Name:John Doe");

        WebElement validateEmail = driver.findElement(By.xpath("//p[@id='email']"));
        assertEquals(validateEmail.getText(), "Email:john@example.com");

        WebElement validateCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        assertEquals(validateCurrentAddress.getText(), "Current Address :123 Street,City");

        WebElement validatePermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        assertEquals(validatePermanentAddress.getText(), "Permananet Address :456 Avenue,City");

    }


    @Test
    public void testcase02() {
        //Scroll the page
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Click on the element menu
        mainPage.elementsMenu.click();

        //Click on the checkbox menu
        mainPage.checkBoxMenu.click();

        //Click on the Expand Arrow
        mainPage.expandArrow.click();

        //Click on the Arrow
        mainPage.desktopClick.click();

        WebElement selectionsValidation = driver.findElement(By.xpath("//div[@id='result']"));
        assertEquals("You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands",selectionsValidation.getText());


    }


    @Test
    public void testcase03() {

        //Scroll the page
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Click on the element menu
        mainPage.elementsMenu.click();

        //Click on the radio button menu
        mainPage.radioButtonMenu.click();

        //Click on the radio button
        mainPage.radioButton.click();

        WebElement radioButtonResult = driver.findElement(By.xpath("//p[@class='mt-3']"));
        assertEquals("You have selected Yes", radioButtonResult.getText());

    }
    @Test
    public void testcase04() {

        //Scroll the page
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Click on the element menu
        mainPage.elementsMenu.click();

        //Click on the checkbox menu
        mainPage.buttonsMenu.click();

        //Double Click Me
        Actions action = new Actions(driver);

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        action.doubleClick(doubleClickButton).build().perform();

        WebElement doubleClickMessage = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", doubleClickMessage);
        assertEquals("You have done a double click", doubleClickMessage.getText());

    }

    @Test
    public void testcase05() {

        //Scroll the page
        WebElement ScrollUpToWidgets = driver.findElement(By.xpath("//h5[text()='Widgets']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToWidgets);


        //Click on the widget menu
        mainPage.widgetsMenu.click();

        //Click on the Date Picker
        mainPage.datePicker.click();

        //Click on the Select date
        mainPage.selectDate.click();

        //  Select  month dropdown
        Select monthDropdown = new Select(driver.findElement(By.className("react-datepicker__month-select")));

        // Select the month October
        monthDropdown.selectByValue("9");

        // Select  year dropdown
        Select yearDropdown = new Select(driver.findElement(By.className("react-datepicker__year-select")));

        // Select the year 2024
        yearDropdown.selectByValue("2024");

        // Select the 15th day of the month
        driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--015')]")).click();


    }

    @Test
    public void testcase06() {

        //Scroll the page
        WebElement ScrollUpToAlertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToAlertsFrameWindows);

        //Click on the AlertsFrameWindows  menu
        mainPage.AlertsFrameWindows.click();

        //Scroll to modal dialogs
        WebElement ScrollToModalDialogs = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollToModalDialogs);

        //Click on the Modal Dialogs
        mainPage.modalDialogs.click();

        //Click on the  Close small modal
        mainPage.smallModal.click();

        //Click on the  Close small modal
        mainPage.closeSmallModal.click();

    }
    @Test
    public void testcase07() {

        //Scroll the page
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Click on the element menu
        mainPage.elementsMenu.click();

        //Click on links
        mainPage.Links.click();

        //Click on home
        mainPage.HomeLink.click();


    }

    }



