package com.enhanzer.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;


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
        WebElement ScrollUpToElements = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollUpToElements);

        //Navigate on the forms menu
        mainPage.formsMenu.click();

        //Click on the practice form menu
        mainPage.practiceFormMenu.click();

        //Enter First name
        WebElement firstName = driver.findElement(By.xpath("//input [@id='firstName']"));
        firstName.sendKeys("Saduni");

        //Enter Last name
        WebElement lastName = driver.findElement(By.xpath("//input [@id='lastName']"));
        lastName.sendKeys("Perera");

        //Enter Email
        WebElement email = driver.findElement(By.xpath("//input [@id='userEmail']"));
        email.sendKeys("saduni@example.com");

        //Select Gender
        mainPage.gender.click();

        //Enter Mobile number
        WebElement mobileNo = driver.findElement(By.xpath("//input [@id='userNumber']"));
        mobileNo.sendKeys("0112356987");

        //Select Date of birth
        mainPage.datePicker.click();

        // Select  year dropdown
        Select yearDropdown = new Select(driver.findElement(By.className("react-datepicker__year-select")));

        // Select the year 2024
        yearDropdown.selectByValue("1998");

        //  Select  month dropdown
        Select monthDropdown = new Select(driver.findElement(By.className("react-datepicker__month-select")));

        // Select the month October
        monthDropdown.selectByValue("October");

        //Select Date
        mainPage.date.click();

        //Enter First name
        WebElement subjects = driver.findElement(By.xpath("//div [@class='subjects-auto-complete__control css-yk16xz-control']"));
        subjects.sendKeys("Multimedia,Project Management,Networking");


        //Select Hobbies
        mainPage.sports.click();
        mainPage.music.click();

        // Select Picture
        mainPage.picture.click();


        //Enter Current Address
        WebElement currentAddress = driver.findElement(By.xpath("//input [@id='currentAddress']"));
        currentAddress.sendKeys("123,Temple Road,Haryana");

        //Select State
        mainPage.state.click();

        // Select State dropdown
        Select stateDropdown = new Select(driver.findElement(By.className("css-tlfecz-indicatorContainer")));

        // Select the state Haryana
        stateDropdown.selectByValue("Haryana");

        //Select State
        mainPage.city.click();

        // Select city dropdown
        Select cityDropdown = new Select(driver.findElement(By.className("css-tlfecz-indicatorContainer")));

        // Select the city Panipat
        cityDropdown.selectByValue("Panipat");

        //Click on submit button
        mainPage.submitButton.click();

        // Validate fields
        WebElement validateFirstName = driver.findElement(By.xpath("//p[@id='fname']"));
        assertEquals(validateFirstName.getText(), "FName:Saduni");

        WebElement validateLastName = driver.findElement(By.xpath("//p[@id='lname']"));
        assertEquals(validateLastName.getText(), "LName:Perera");

        WebElement validateEmail = driver.findElement(By.xpath("//p[@id='email']"));
        assertEquals(validateEmail.getText(), "Email:saduni@example.com");

        WebElement validateMobile = driver.findElement(By.xpath("//p[@id='mobile']"));
        assertEquals(validateMobile.getText(), "Mobile:0112356987");

        WebElement validateSubjects = driver.findElement(By.xpath("//p[@id='subjects']"));
        assertEquals(validateSubjects.getText(), "Multimedia,Project Management,Networking");

        WebElement validateCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        assertEquals(validateCurrentAddress.getText(), "Current Address :123,Temple Road,Haryana");

    }



}
