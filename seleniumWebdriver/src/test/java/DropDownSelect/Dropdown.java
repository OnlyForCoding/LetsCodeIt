package DropDownSelect;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

/**
 * Created by jitendra on 12/9/17.
 */
public class Dropdown extends BaseClass {

    @Test
    public void dropdownTest(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        List<WebElement> options = dropdownList.findElements(By.tagName("option"));

        for (int i=0; i<options.size();i++){
            if (options.get(i).getText().equalsIgnoreCase("Option 1")){
                options.get(i).click();
            }
        }

        String selectedOption = "";

        for (int i=0 ; i<options.size();i++) {
            if (options.get(i).isSelected()) {
                selectedOption = options.get(i).getText();
            }
        }

        assertThat(selectedOption, is("Option 1"));
    }
}
