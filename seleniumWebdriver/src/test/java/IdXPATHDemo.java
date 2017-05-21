import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 9/5/17.
 */
public class IdXPATHDemo {
   WebDriver driver;
    @BeforeClass
    public void init(){
        System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void idXpath(){
       // driver.get("http://www.google.com");
        driver.findElement(By.id(""));
    }

   }
