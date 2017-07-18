package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 30/6/17.
 */
public class UpdateTimeSheet extends BaseClass {

    @Test
    public void updateTimeSheet(){
        driver.get("http://timesheet.forgeahead.io/");
        driver.findElement(By.id("loginSSO")).click();
        waitOnElement(20,By.name("email"));
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("jitendra.pisal@forgeahead.io");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
