import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * Created by dell on 6/5/17.
 */
public class ExtentFactory {

    public static ExtentReports getInstance(){
        ExtentReports extent;
        String path = "/home/dell/Desktop/myExtentReoprt.html";
        extent = new ExtentReports(path,true);
        extent.addSystemInfo("Selenium Version","3.3.1");
        extent.addSystemInfo("Platform","LINUX");
        return extent;
    }
}
