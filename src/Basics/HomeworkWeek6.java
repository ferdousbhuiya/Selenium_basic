package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkWeek6 {

    public static void main(String [] args) throws InterruptedException {
        WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();


        //WebElement searchbar= driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        //WebElement searchbar = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
        //searchbar.sendKeys("jewelry sets");

        //header/div[3]/nav[1]/ul[1]/li[2]/span[1]/a[1]/span[2]/*[1]


        //WebElement cart = driver.findElement(By.xpath("//a[contains(@aria-label, 'Cart')]"));
        //cart.click();


// Promoted Seasonal Navigation Picture Links
//
//Answer: //body/main[@id='content']/div[1]/div[1]/div[2]/div[1]/ul[1]



        // Sign in button

        //WebElement signin = driver.findElement(By.xpath("//button[contains(@class, 'wt-btn wt-btn--small')]"));
       // signin.click();


       // All Header Navigation Buttons
      //  Answer: Xpath : //body/nav[1]/div[1]/div[1]/div[1]/ul[1]


// Subscribe email input
        WebElement subscribe = driver.findElement(By.xpath("//input[@id='email-list-signup-email-input']"));
        subscribe.sendKeys("Abdullah");


// Subscribe button
WebElement sbscrbbutn = driver.findElement(By.xpath("//button[@class = 'wt-btn wt-input-btn-group__btn']"));
sbscrbbutn.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();



    }

}
