package basepkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.Util;

/**
 * Created by jitendra on 29/5/17.
 */
public class BaseClass {

    public WebDriver driver;
    private Util utils;

    @BeforeSuite
    public void initUtils(){
        this.utils = new Util();
    }

    @BeforeClass
    public void init() {
        driver = utils.getDriver(utils.getBrowser());
    }

    @BeforeMethod
    public void maximize(){driver.manage().window().maximize();}

    /*@AfterClass
    public void tearDown(){driver.close();driver.quit();}*/
}
