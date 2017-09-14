package downloading;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jitendra on 14/9/17.
 */
public class Downloading extends BaseClass {

    Logger log = Logger.getLogger(Downloading.class.getName());

    @Test
    public void downloading() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        List<WebElement> listOfElement =  driver.findElements(By.cssSelector(".example a"));

        String fileName = "";
        String downloadedFileName = "";

        for (int i = 0 ; i < listOfElement.size(); i++){
            fileName = listOfElement.get(i).getText();
            listOfElement.get(i).click();
            Thread.sleep(2000);
            downloadedFileName = folder.listFiles()[0].toString().split("/")[1];
            Assert.assertEquals(fileName,downloadedFileName);
            for (File file:folder.listFiles()){
                file.delete();
            }
        }

    }
}
