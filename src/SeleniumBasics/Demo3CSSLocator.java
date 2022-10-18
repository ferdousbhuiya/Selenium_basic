package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3CSSLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://facebook.com");

        driver.manage().window().maximize();// Maximize the webpage

        // by CSS locator
        //tag and id combination
                //driver.findElement(By.cssSelector("#email")).sendKeys("ferdousbhuiya@gmail.com"); //or
                //driver.findElement(By.cssSelector("input#email")).sendKeys("ferdousbhuiya@gmail.com");

        //tag and class

        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Babul");// there are 2 elements
        //in this case the first one will select.
        //driver.findElement(By.cssSelector(".inputtext")).sendKeys("Babul");// only class


        //tag and attribute used

        //driver.findElement(By.cssSelector("[name=email]")).sendKeys("Babul");
        //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Ferdous");


        //Tag, class and attribute
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Taslima");
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Taslima");
        Thread.sleep(5000);
                driver.quit();
    }
}