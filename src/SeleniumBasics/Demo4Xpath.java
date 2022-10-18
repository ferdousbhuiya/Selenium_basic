package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();// Maximize the webpage


// Absolute Xpath
//WebElement searchbox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]"));
//searchbox.sendKeys("T-shirts");
//WebElement clckbtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]"));
//clckbtn.click();

// Relative Xpath:

        //WebElement srchbx = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        //srchbx.sendKeys("T-shirts");
        //WebElement clkbtn = driver.findElement(By.xpath("//button[@name='submit_search']"));
        //clkbtn.click();



        //Xpath with 'or' operator

/*
        WebElement srchbx = driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']"));
        srchbx.sendKeys("T-shirts");
        WebElement clkbtn = driver.findElement(By.xpath("//button[@name='submit_search' or @type = 'submit']"));
        clkbtn.click();
*/
        // Same like as 'or' we can use 'and' also

        // going for acontains()
/*
        WebElement srchbx = driver.findElement(By.xpath("//input [contains (@id, 'query_top')]"));
        srchbx.sendKeys("T-shirts");
        WebElement clkbtn = driver.findElement(By.xpath("//button [contains (@name, 'search')]"));
        clkbtn.click();

*/

        // going for start-with
/*
        WebElement srchbx = driver.findElement(By.xpath("//input [starts-with (@id, 'search_query')]"));
        srchbx.sendKeys("T-shirts");
        WebElement clkbtn = driver.findElement(By.xpath("//button [starts-with (@name, 'submit_')]"));
        clkbtn.click();

   */




   //// going with text()
        //WebElement srchbx = driver.findElement(By.xpath("//input [starts-with (@id, 'search_query')]"));
        //srchbx.sendKeys("T-shirts");
        // clkbtn = driver.findElement(By.xpath("//a[text()='Women']"));
       // clkbtn.click();

// // go with chained xpath

        WebElement srchbx = driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']"));
        srchbx.sendKeys("T-shirts");
        WebElement clkbtn = driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']"));
        clkbtn.click();
    }

}
