package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 5/6/17.
 */
public class ElementDisplayed extends BaseClass {

    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get("http://letskodeit.teachable.com/p/practice");
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box displayed :: "+textBox.isDisplayed());

        Thread.sleep(2000);

        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        hideBtn.click();
        System.out.println("clicked on hide button .....");
        System.out.println("Text Box displayed :: "+textBox.isDisplayed());

        Thread.sleep(2000);

        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        showBtn.click();
        System.out.println("clicked on show button .....");
        System.out.println("Text Box displayed :: "+textBox.isDisplayed());
    }

    @Test
    public void testExpedia(){
        driver.get("https://www.expedia.co.in");
        WebElement ageEle = driver.findElement(By.id("hotel-1-age-select-1"));
        System.out.println("Age DropDown displayed :: "+ageEle.isDisplayed());
    }
}
