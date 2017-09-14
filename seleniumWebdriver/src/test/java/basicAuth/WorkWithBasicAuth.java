package basicAuth;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jitendra on 12/9/17.
 */
public class WorkWithBasicAuth extends BaseClass{

    @Test
    public void workWithBasicAuthTest(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        String pageMessage = driver.findElement(By.cssSelector("p")).getText();
        assertThat(pageMessage,containsString("Congratulations!"));
    }
}
