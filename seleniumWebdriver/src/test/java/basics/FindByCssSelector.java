package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by dell on 3/6/17.
 */
public class FindByCssSelector extends BaseClass {

    @Test
    public void cssSelector(){
        driver.get("https://letskodeit.teachable.com/p/practice");
        System.out.println(driver.findElement(By.cssSelector("fieldset>.table-display")).getAttribute("class"));
    }

}
