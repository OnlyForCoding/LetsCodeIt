package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by jitendra on 7/6/17.
 */
public class ExplicitWaitWithCustomCondition extends BaseClass {

    @Test
    public void explicitWaitCustomCond(){
        driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");
        driver.findElement(By.linkText("Page 4")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement message = wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver input) {
                return input.findElement(By.id("page4"));
            }
        });
        assertTrue(message.getText().contains("Nunc nibh tortor"));
    }

    @Test
    public void waitForDisplay(){
        driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");
        driver.findElement(By.linkText("Page 4")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        boolean mesg = wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver input) {
                return input.findElement(By.id("page")).isDisplayed();
            }
        });
        assertTrue(mesg,"page4 id not displayed ....");
    }
}
