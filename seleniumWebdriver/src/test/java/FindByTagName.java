import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 12/5/17.
 */
public class FindByTagName {

    WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findByTagName(){
        driver.get("https://demostore.x-cart.com/");
        List<WebElement> lst = driver.findElements(By.tagName("li"));
        System.out.println("***********"+lst.size()+"********************** ");
        List<String> str = new ArrayList<String>();

        for (WebElement element: lst
             ) {
            str.add(element.findElement(By.tagName("a")).findElement(By.tagName("span")).getText());

        }

        System.out.println("list :" +str.toString());
    }
}
