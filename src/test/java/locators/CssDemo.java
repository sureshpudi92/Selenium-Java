package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        //tag id            tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles");// #id

        //tag class         tag.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("mobiles"); // .classname

        //tag attribute     tagname[attribute=value]
        //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("mobiles"); //single attribute
        //driver.findElement(By.cssSelector("input[name='q'][type='text']")).sendKeys("mobiles"); //multiple attribute

        //tag classname attribute   tagname.classname[attribute=value]
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("mobiles"); //tagname.classname[attribute=value]
        //driver.findElement(By.cssSelector("input.search-box-text[name='q'][type='text']")).sendKeys("mobiles"); //tagname.classname[attribute=value]





        driver.quit();

    }
}
