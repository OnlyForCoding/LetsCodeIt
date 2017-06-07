package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by jitendra on 7/6/17.
 */
public class ExplicitWait extends BaseClass {

    @Test
    public void explicitWait(){
        driver.get("http://www.google.com");
        //Enter a term to search and submit
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("selenium");
        query.submit();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("selenium"));
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
    }
}
