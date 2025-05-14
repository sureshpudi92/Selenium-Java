package getMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/"); // URL of the website
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        // Get the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);
        // Get the page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);
        // Get the window handle
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window handle is: " + windowHandle);
        // Get the window handles
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window handles are: " + windowHandles);



    }
}
