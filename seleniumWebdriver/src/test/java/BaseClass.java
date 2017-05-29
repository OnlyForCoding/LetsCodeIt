import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utilities.Util;

import java.util.concurrent.TimeUnit;

/**
 * Created by jitendra on 29/5/17.
 */
public class BaseClass {

    WebDriver driver;
    private Util utils;

    @BeforeSuite
    public void initUtils(){
        this.utils = new Util();
    }

    @BeforeClass
    public void init() {
        driver = utils.getDriver(utils.getBrowser());
    }
}
