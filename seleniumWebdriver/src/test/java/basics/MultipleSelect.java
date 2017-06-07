package basics;

import basepkg.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by jitendra on 5/6/17.
 */
public class MultipleSelect extends BaseClass {

    static Logger log = Logger.getLogger(MultipleSelect.class.getName());

    @Test
    public void multipleSelect() throws InterruptedException {

        driver.get("http://letskodeit.teachable.com/p/practice");
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select mult = new Select(element);

        log.info("select Apple by value");
        mult.selectByValue("apple");
        Thread.sleep(2000);
        log.info(mult.getFirstSelectedOption().isSelected());

        log.info("De-select Apple by value");
        mult.deselectByValue("apple");
        log.info(mult.isMultiple());
        Thread.sleep(2000);

        List<WebElement> options = mult.getOptions();

        log.info("Select all ");
        for (int i=0;i<options.size();i++){
            mult.selectByIndex(i);
            log.info("is "+options.get(i)+" selected ??-> "+options.get(i).isSelected());
            Thread.sleep(2000);
        }

        log.info("De-select All");
        mult.deselectAll();

    }
}
