package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by dell on 4/6/17.
 */
public class RadioButtonsAndCheckBoxes extends BaseClass {

    @Test
    public void radioButton_checkBox() throws InterruptedException {
        driver.get("https://letskodeit.teachable.com/p/practice");

        List<WebElement> element = driver.findElements(By.xpath(".//div[@id='radio-btn-example']//input"));

        element.get(0).click();

        element.get(1).click();

        Assert.assertNotEquals(element.get(0).isSelected(),element.get(1).isSelected());

        for (WebElement ele: element) {
            Thread.sleep(3000);
            ele.click();
            System.out.println("is "+ele+" selected!! --> "+ele.isSelected());
        }

       List<WebElement> elements =  driver.findElements(By.xpath(".//div[@id='checkbox-example']//input"));

        elements.get(0).click();

        elements.get(1).click();

        Assert.assertEquals(elements.get(0).isSelected(),elements.get(1).isSelected());

        for (WebElement ele: elements) {
            Thread.sleep(3000);
            ele.click();
            System.out.println("is "+ele+" selected!! --> "+ele.isSelected());
        }

    }
}
