package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by dell on 4/6/17.
 */
public class DropDownSelect extends BaseClass {

    @Test
    public void dropDownSelect() throws InterruptedException {
        driver.get("https://www.expedia.co.in/");
        WebElement select = driver.findElement(By.id("hotel-rooms"));
        Select sel = new Select(select);

        List<WebElement> options = sel.getOptions();

        for (int i=0;i<options.size();i++){
            System.out.println(options.get(i).getAttribute("value"));
            Thread.sleep(2000);
        }
    }
}
