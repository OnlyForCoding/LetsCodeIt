package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by dell on 4/6/17.
 */
public class AdvancedXpath extends BaseClass {

    @Test
    public void advancedXpath() throws InterruptedException {
        driver.get("https://dhtmlx.com/docs/products/dhtmlxGrid/");
        WebElement element = driver.findElement(By.id("layoutObj"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()='Alia Hilpert']//preceding-sibling::td/img"));
        System.out.println(driver.findElement(By.xpath("//td[text()='Alia Hilpert']//preceding-sibling::td/img")).isSelected()) ;

    }
}
