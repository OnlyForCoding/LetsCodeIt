package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by dell on 4/6/17.
 */
public class ElementState extends BaseClass{

    @Test
    public void elementState() throws InterruptedException {
        driver.get("https://www.google.co.in/");
        //WebElement element = driver.findElement(By.id("gs_htif0"));
        /***
         * Below line will throw an Exception :
         * org.openqa.selenium.InvalidElementStateException: invalid element state
         * It means either the element is disabled. If you see this element in the DOM you will find "disable="" "
         * attribute. It means this element is not available for interaction or disabled.Hence getting above EXCEPTION
         */
        WebElement element = driver.findElement(By.id("lst-ib"));
        //element.sendKeys("letskodeit");
        System.out.println("element enabled ?? --> "+element.isEnabled());

        WebElement element1 = driver.findElement(By.id("gs_htif0"));
        System.out.println("element1 enabled ?? --> "+element1.isEnabled());

        WebElement element2 = driver.findElement(By.id("gs_sc0"));
        System.out.println("element2 enabled ?? --> "+element2.isEnabled());

    }
}
