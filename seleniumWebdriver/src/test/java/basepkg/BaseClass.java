package basepkg;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.Util;

/**
 * Created by jitendra on 29/5/17.
 */
public class BaseClass extends Util{

    @BeforeSuite
    public void init() throws Exception{
        String log4jConfPath = "src/test/java/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void maximize(){}

    @AfterClass
    public void tearDown(){driver.close();driver.quit();}
}
