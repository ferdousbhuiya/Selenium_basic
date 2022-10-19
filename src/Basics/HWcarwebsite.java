package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWcarwebsite {

    public static void main(String [] arg) throws InterruptedException {
        WebDriver driver= null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.autotrader.com/");
        driver.manage().window().maximize();



        //Car Make Dropdown/Combo Box

        //WebElement combo = driver.findElement(By.xpath("//*[@id='2230463214']"));
        //combo.click();



//Car Model Dropdown/Combo Box

        WebElement makeCombo = driver.findElement(By.xpath("//*[@id='1617644117']"));
        makeCombo.click();


//All Car Image Links in `Cars For You` Carousel
        Answer: Xpath: //div[@class = 'carousel-container-inner']


        Thread.sleep(5000);

        driver.quit();
        driver.close();

    }
}
