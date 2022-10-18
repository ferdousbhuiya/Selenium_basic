package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {

    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();

        //id & Name locators
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("T-shirts");

        WebElement clkbutton = driver.findElement(By.name("submit_search"));
                clkbutton.click();

                //LinkedText & partial LinkText locator

        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        //driver.findElement(By.partialLinkText("Short Sleeve T-shirts")).click();
        Thread.sleep(5000);
        //driver.close();
        driver.quit();
    }
}
