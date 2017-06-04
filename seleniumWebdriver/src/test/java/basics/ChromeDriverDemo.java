package basics;

import basepkg.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by jitendra on 9/5/17.
 */
public class ChromeDriverDemo extends BaseClass {

    @BeforeMethod
    public void before() {
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
