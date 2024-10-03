package pages;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.AfterMethod;
import  org.testng.annotations.BeforeMethod;
import  org.testng.annotations.Test;

import  io.github.bonigarcia.wdm.WebDriverManager;

public class ThinkingContactList {

    private WebDriver driver;
    
    @BeforeMethod
    public void setUp(){
        //init WebDriver to Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); 
    }

    /**
     * @throws InterruptedException
     */
    @Test
    public void navigateToThinkingContactList() throws InterruptedException{
        //Go to the page
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown(){
        //Close the browser session after tests
        if (driver != null){
            driver.quit();
        }
    }

}
