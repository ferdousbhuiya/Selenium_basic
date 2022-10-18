package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo5XpathAxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers");

        driver.manage().window().maximize();// Maximize the webpage

        //Using self************

        WebElement text = driver.findElement(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/self::a"));
        String text1 = text.getText();
        System.out.println(text1);


        //Using Parent

        WebElement parent = driver.findElement(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/parent::td"));
        String parent1 = parent.getText();
        System.out.println(parent1);


        //Using child node  **********
        //a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/child::td


        List<WebElement > child = (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/child::td"));
        //String text1 = text.getText();
        System.out.println("Number of Child Elements : "+ child.size());

        // using Ancestor

        WebElement Ancestor = driver.findElement(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr"));// K&R Rail Engineering X 31.35 37.60 + 19.94
        String Ancestor1 = Ancestor.getText();
        System.out.println(Ancestor1);
            //Using Descendant

        List<WebElement>Descedant = driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/descendant::td"));
        int Descedant1 = Descedant.size();
        System.out.println("Number of Descendant nodes: "+Descedant1);
// Following - Selects everything in the document after the closing tag of the current node

        List<WebElement>followingNodes = driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/following::tr"));
System.out.println("Number of following nodes: "+followingNodes.size());

// Following-siblings : Select all siblings after the current node

        List<WebElement>followingSiblingNodes = driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of following-siblings nodes: "+followingSiblingNodes.size());

// Preceding - Selects all nodes that appear before the current node in the document

        List<WebElement>followingPreceeding = driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of preceding nodes: "+followingPreceeding.size());

//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/preceding-sibling::tr

//Preceding-sibling - Selects all siblings before the current node


        List<WebElement>followingPreceedingSibling = driver.findElements(By.xpath("//a[contains(text(),'K&R Rail Engineering')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of preceding Sibling nodes: "+followingPreceedingSibling.size());

        driver.close();
    }
}
