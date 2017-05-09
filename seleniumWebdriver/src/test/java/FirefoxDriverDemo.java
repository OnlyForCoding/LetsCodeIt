import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 9/5/17.
 */
public class FirefoxDriverDemo {
   WebDriver driver;
    @BeforeClass
    public void init(){
        System.setProperty("webdriver.gecko.driver","/home/jitendra/Documents/webdriver/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void firefox(){
        driver.get("http://www.google.com");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
