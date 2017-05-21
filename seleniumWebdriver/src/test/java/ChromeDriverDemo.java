import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by jitendra on 9/5/17.
 */
public class ChromeDriverDemo {
    WebDriver driver;
    @BeforeClass
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/home/jitendra/Documents/webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void chrome(){
        driver.get("http://www.google.co.in");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
