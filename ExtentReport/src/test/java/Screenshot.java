import org.apache.bcel.generic.RET;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by dell on 6/5/17.
 */
public class Screenshot {

    public static String getScreenShot(WebDriver driver, String fileName) throws IOException {
        fileName = fileName + ".png";
        String directory = "/home/dell/Desktop/";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File(directory + fileName));
        return directory + fileName;
    }
}
