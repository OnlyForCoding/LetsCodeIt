package basics;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

/**
 * Created by jitendra on 29/6/17.
 */
public class UpdateTickets extends BaseClass{

    @Test(priority = 0)
    public void login(){
        driver.get("http://support.forgeahead.io/login.jsp?os_destination=%2Fsecure%2FDashboard.jspa");
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.findElement(By.id("login-form-username")).sendKeys(System.getProperty("username"));
        driver.findElement(By.id("login-form-password")).sendKeys(System.getProperty("password"));
        driver.findElement(By.id("login-form-submit")).click();
    }

    @Test(priority = 1)
    public void updateTickets() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.switchTo().frame("gadget-10002");
        boolean isTrPresent = false;
        if (isTicketEmpty()) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//table[@id='issuetable']")));
            isTrPresent = driver.findElement(By.xpath(".//table[@id='issuetable']/tbody/tr")).isDisplayed();
        }
        while(isTrPresent) {
            List<WebElement> allRows;
            try {
                allRows = driver.findElements(By.xpath(".//table[@id='issuetable']/tbody/tr"));
            }catch (Exception e){
                break;
            }
            String issueId = allRows.get(0).getAttribute("id");
            String isLeave = driver.findElement(By.xpath(".//tr[@id='"+issueId+"']//td[@class='nav summary']//a[@class='issue-link']")).getText();
            if (isLeave.contains("Leave")){
                driver.findElement(By.xpath(".//tr[@id='"+issueId+"']//td[@class='nav summary']//a[@class='issue-link']")).click();
                driver.findElement(By.ByClassName.xpath(".//ul[@id='opsbar-opsbar-transitions']//span[text()='Resolve Issue']")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("issue-workflow-transition-submit")));
                driver.findElement(By.id("issue-workflow-transition-submit")).submit();
            }else {
                driver.findElement(By.xpath(".//tr[@id='" + issueId + "']//td[@class='nav summary']/p/a[contains(text(),'Automation')]")).click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[@id='edit-issue']//span[text()='Edit']")));
                driver.findElement(By.xpath(".//a[@id='edit-issue']//span[text()='Edit']")).click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("timetracking_originalestimate")));
                driver.findElement(By.id("timetracking_originalestimate")).click();
                driver.findElement(By.id("timetracking_originalestimate")).clear();
                driver.findElement(By.id("timetracking_originalestimate")).sendKeys("1d");
                driver.findElement(By.id("edit-issue-submit")).submit();

                Thread.sleep(2000);

                boolean breakIt = true;
                while (true) {
                    breakIt = true;
                    try {
                        driver.findElement(By.xpath(".//a[@id='opsbar-operations_more']//span[text()='More']")).click();
                        ;
                    } catch (Exception e) {
                        if (e.getMessage().contains("element is not attached")) {
                            breakIt = false;
                        }
                    }
                    if (breakIt) {
                        break;
                    }

                }

                if (!driver.findElement(By.id("log-work")).isDisplayed()){
                    driver.findElement(By.xpath(".//a[@id='opsbar-operations_more']//span[text()='More']")).click();
                }
                driver.findElement(By.id("log-work")).click();
                Thread.sleep(1000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("log-work-time-logged")));
                driver.findElement(By.id("log-work-time-logged")).clear();
                driver.findElement(By.id("log-work-time-logged")).click();
                driver.findElement(By.id("log-work-time-logged")).sendKeys("1d");
                driver.findElement(By.id("log-work-submit")).submit();
                Thread.sleep(1000);
                driver.findElement(By.ByClassName.xpath(".//ul[@id='opsbar-opsbar-transitions']//span[text()='Resolve Issue']")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("issue-workflow-transition-submit")));
                driver.findElement(By.id("issue-workflow-transition-submit")).submit();
            }
            driver.navigate().back();
            driver.switchTo().frame("gadget-10002");

            if(isTicketEmpty()) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//table[@id='issuetable']")));
                isTrPresent = driver.findElement(By.xpath(".//table[@id='issuetable']/tbody/tr")).isDisplayed();
            }else {
                isTrPresent = false;
            }
        }
        waitOnElement(10,By.id("header-details-user-fullname"));
        driver.findElement(By.id("header-details-user-fullname")).click();
        waitOnElement(10,By.id("log_out"));
        driver.findElement(By.id("log_out")).click();
        waitOnElement(10,By.xpath("//li[@id='user-options']//a[text()='Log In']"));
        Assert.assertTrue(waitOnElement(10,By.xpath("//li[@id='user-options']//a[text()='Log In']")),"User in not looged out successfully");
        System.out.println("Logged Out Successfully");
    }

    @Test(priority = 2)
    public void logout(){
        /*waitOnElement(10,By.id("header-details-user-fullname"));
        driver.findElement(By.id("header-details-user-fullname")).click();
        waitOnElement(10,By.id("log_out"));
        driver.findElement(By.id("log_out")).click();
        waitOnElement(10,By.xpath("//li[@id='user-options']//a[text()='Log In']"));
        Assert.assertTrue(waitOnElement(10,By.xpath("//li[@id='user-options']//a[text()='Log In']")),"User in not looged out successfully");
        System.out.println("Logged Out Successfully");*/
    }

    public boolean apply(WebElement element) {
        try {
            return !element.isDisplayed();
        } catch (StaleElementReferenceException elementHasDisappeared) {
            return true;
        }
    }

    public boolean isTicketEmpty(){
        boolean flag = false;
        try{
            driver.findElement(By.className("empty-results"));
            System.out.println("No more tickets available for resolve");
            flag = false;
        }catch (Exception e){
            flag = true;
        }
        return flag;
    }
}
