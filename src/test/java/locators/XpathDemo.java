package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        //xpath with single attribute
        // driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");

        //xpath with multiple attribute
        // driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("mobiles");

        //xpath with and operator
        // driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("mobiles");

        //xpath with or operator
        // driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("mobiles");

        //xpath with text() method
        // driver.findElement(By.xpath("//a[text()='Register']")).click();

        //xpath with contains() method
        // driver.findElement(By.xpath("//a[contains(text(),'Regis')]")).click(); //Register

        //xpath with starts-with() method
        // driver.findElement(By.xpath("//a[starts-with(text(),'Reg')]")).click(); //Register

        //xpath with ends-with() method
        // driver.findElement(By.xpath("//a[ends-with(text(),'gister')]")).click(); //Register

       //chained xpath
        // driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a")).click(); //Register

        //xpath with parent
        // driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a[text()='Register']/parent::li")).click(); //Register

        //xpath with child
        // driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/child::a[text()='Register']")).click(); //Register

        //xpath with ancestor
        // driver.findElement(By.xpath("//a[text()='Register']/ancestor::div[@class='header-menu']")).click(); //Register

        //xpath with descendant
        // driver.findElement(By.xpath("//div[@class='header-menu']/descendant::a[text()='Register']")).click(); //Register

        driver.quit();







    }

}
