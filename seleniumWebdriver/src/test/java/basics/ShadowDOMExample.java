package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 20/6/17.
 */
public class ShadowDOMExample extends BaseClass{

    @Test
    public void shadowElement(){
        driver.get("http://www.google.com");
        WebElement ele = expandRootElement(driver);
        System.out.println("hi");


    }
}
