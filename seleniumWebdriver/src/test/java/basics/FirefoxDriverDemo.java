package basics;

import basepkg.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 9/5/17.
 */
public class FirefoxDriverDemo extends BaseClass {

    @Test
    public void firefox(){
        driver.get("http://www.google.com");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
