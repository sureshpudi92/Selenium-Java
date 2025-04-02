package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Assignment
---------------
Open application "https://www.demoblaze.com/index.html"

1) Total number of links
2) Total number of images
3) Click on Any product link using linkText /partialLinkText
 */
public class Assignment1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        // 1) Total number of links

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link: links){
            System.out.println(link.getText());// to get the link text
        }
        // 2) Total number of images
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        for(WebElement image: images){
            System.out.println(image.getAttribute("src"));// to get the image source
        }
        // 3) Click on Any product link using linkText /partialLinkText
        driver.findElement(By.linkText("Contact")).click();
        //driver.findElement(By.partialLinkText("Con")).click();  //partialLinkText
        String url=driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        driver.quit();



    }
}
