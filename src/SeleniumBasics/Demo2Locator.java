package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Locator {

    public static void main (String [] args)
    {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();// Maximize the webpage

// Class name as a locator:

        //Here we have used findElements not findElement because we are looking
        //how many slides are there, .size() will give output the number of slides.
        int sliders= driver.findElements(By.className("homeslider-container")).size();
        System.out.println("Number of Slides are :"+sliders);

        // by the tag name:

        int links = driver.findElements(By.tagName("a")).size();
        System.out.println("Number of links available are :"+links);
    }
}
