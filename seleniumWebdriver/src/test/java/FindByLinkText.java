import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by dell on 12/5/17.
 */
public class FindByLinkText {

    WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

   /* @Test
    public void idXpath(){
        driver.get("https://www.google.co.in/");
        driver.findElement(By.linkText("Gmail")).click();
    }*/

    @Test void findByPartialLinkText(){
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("account?")).click();
    }
}
