package basics;

import basepkg.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by jitendra on 7/6/17.
 */
public class ImplicitWait extends BaseClass {

    static Logger log = Logger.getLogger(ImplicitWait.class.getName());

    @Test
    public void implicitWait(){
        driver.get("http://www.google.com");
        log.info("Before implicit timeout...");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Enter a term to search and submit
        log.info("start time is milisec -- > "+System.currentTimeMillis());
        try {
            WebElement query = driver.findElement(By.name("qertert"));
            query.sendKeys("selenium");
            query.submit();
        } catch (NoSuchElementException e){
            log.info("after time is milisec -- > "+System.currentTimeMillis());
            log.info("after implicit timeout...");
        }
    }
}
