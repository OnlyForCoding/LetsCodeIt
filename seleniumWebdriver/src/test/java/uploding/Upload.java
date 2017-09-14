package uploding;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created by jitendra on 13/9/17.
 */
public class Upload extends BaseClass {

    Logger log = Logger.getLogger(Upload.class.getName());

    @Test
    public void uploadFile(){
        String filename = "my.txt";
        File file = new File(filename);
        String path = file.getAbsolutePath();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();
        String text = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(text,filename);
        log.info("hEY");
    }
}
