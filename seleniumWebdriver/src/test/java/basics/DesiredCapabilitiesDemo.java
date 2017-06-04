package basics;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 9/5/17.
 */
public class DesiredCapabilitiesDemo {

    WebDriver driver;
    DesiredCapabilities caps = null;

    @BeforeClass
    public void init(){
        /*System.setProperty("webdriver.gecko.driver","/home/jitendra/Documents/webdriver/geckodriver");
        caps = DesiredCapabilities.firefox();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.LINUX);
        caps.setVersion("47");
        driver = new FirefoxDriver(caps);*/

        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);

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
