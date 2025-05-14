package webdriverIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestCase {

    WebDriver driver; // Declare WebDriver at the class level

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();   // Create an instance of ChromeDriver //upcasting
        driver.manage().window().maximize(); // Maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://demo.nopcommerce.com/"); // Open Google

    }

    @Test
    public void verifyTitle() {
        String act_title = driver.getTitle();
        System.out.println("Actual Title: " + act_title);
        Assert.assertEquals(act_title, "nopCommerce demo store. Home page title", "Title does not matched");
    }

    @AfterTest
    public void teardown() {
        driver.quit(); // Close the browser
    }

}
