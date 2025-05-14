package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //xpath for current node
        // driver.findElement(By.xpath("//a[text()='Log in']")).click(); //Login

        //xpath for parent node
        // driver.findElement(By.xpath("//a[text()='Log in']/parent::li")).click();

        //xpath for following sibling
        // driver.findElement(By.xpath("//a[text()='Log in']/following-sibling::li[1]")).click();

        //xpath for preceding sibling
        // driver.findElement(By.xpath("//a[text()='Log in']/preceding-sibling::li[1]")).click();

        //xpath for child node
        // driver.findElement(By.xpath("//a[text()='Log in']/child::span")).click();

        //xpath for ancestor node
        // driver.findElement(By.xpath("//a[text()='Log in']/ancestor::div")).click();

        //xpath for descendant node
        // driver.findElement(By.xpath("//a[text()='Log in']/descendant::span")).click();

        //xpath for following axis
        // driver.findElement(By.xpath("//a[text()='Log in']/following::li[1]")).click();
        //xpath for preceding axis
        // driver.findElement(By.xpath("//a[text()='Log in']/preceding::li[1]")).click();









    }
}
