import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by dell on 6/5/17.
 */
public class test {

    ExtentReports reports;
    ExtentTest test;
    WebDriver driver;

    @BeforeClass
    public void init(){
        reports = ExtentFactory.getInstance();
        test = reports.startTest("my first test");
        driver = new FirefoxDriver();

    }

    @Test
    public void test(){
        driver.get("http://www.google.co.in");
        boolean isThere;
        try {
            isThere = driver.findElement(By.id("yes")).isDisplayed();
        } catch (NoSuchElementException ex){
            isThere = false;
        }
        Assert.assertTrue(isThere);
        test.log(LogStatus.FAIL,"my first test passed.... ");
    }

    @AfterMethod
    public void tearDown(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE){
            String screen = Screenshot.getScreenShot(driver,testResult.getName());
            test.log(LogStatus.FAIL,test.addScreenCapture(screen));
        }
        driver.quit();
    }

    @AfterClass
    public void end(){
        reports.endTest(test);
        reports.flush();
    }
}
