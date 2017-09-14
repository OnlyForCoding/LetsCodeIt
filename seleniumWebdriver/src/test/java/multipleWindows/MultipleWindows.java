package multipleWindows;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

/**
 * Created by jitendra on 12/9/17.
 */
public class MultipleWindows extends BaseClass{

    @Test
    public void multipleWindowsTest(){
        driver.get("http://the-internet.herokuapp.com/windows");
        String firstWindow = driver.getWindowHandle();
        String newWindow = "";
        for (int i=0 ; i<4 ; i++) {
            driver.findElement(By.cssSelector(".example a")).click();
        }

        Set<String> windows = driver.getWindowHandles();

        for (String window: windows
             ) {
            if (!window.equals(firstWindow)){
                newWindow = window;
            }

        }

        for (String win : windows){
            if (!win.equals(firstWindow)){
                driver.switchTo().window(win);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Assert.assertEquals(driver.getTitle(),"New Window");
            }
        }

        //driver.switchTo().window(firstWindow);
        //Assert.assertNotEquals(driver.getTitle(),"New Window");

    }
}
