package utilities;

import org.apache.bcel.generic.BREAKPOINT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jitendra on 29/5/17.
 */
public class Util {

    private String browser;
    private String platform;
    private String mode;
    private RemoteWebDriver driver;
    private String ipAddress;
    private DesiredCapabilities caps ;

    public Util(){
        this.browser = getBrowser();
        this.platform = getPlatform();
        this.mode = getMode();
        this.ipAddress = getIpAddress();
    }

    /***
     * get browser on which test needs to be run
     * @return browser
     */
    public String getBrowser(){
        String browser = System.getProperty("browser");
        if (browser == null || browser == ""){
            this.browser = "firefox";
            System.out.println("browser is : "+this.browser);
        } else {
            this.browser = browser;
            System.out.println("browser is : "+System.getProperty("browser"));
        }
        return this.browser;
    }

    public String getPlatform(){
        String platform = System.getProperty("platform");
        if (platform == null || platform == ""){
            this.platform = "linux";
        } else
            this.platform = platform ;
        return this.platform;
    }

    public RemoteWebDriver initDriver(String browser) {
        if (browser == "chrome"){
            this.driver = new ChromeDriver();
        } else if (browser == "firefox"){
            this.driver = new FirefoxDriver();
        } else if (browser == "internet explorer"){
            this.driver = new InternetExplorerDriver();
        } else if (browser == "MicrosoftEdge"){
            this.driver = new EdgeDriver();
        } else if (browser == "safari"){
            this.driver = new SafariDriver();
        }
        return this.driver;
    }

    public RemoteWebDriver getDriver(String browser){
        if (getMode().equals("local")){
            return getLocalDriver(browser);
        }else
            return getRemoteDriver(browser);
    }

    public RemoteWebDriver getLocalDriver(String browser){
        getDriversPath(getPlatform(),browser);
        return initDriver(browser);
    }

    public String getMode(){
        String mode = System.getProperty("mode");
        if (mode == null || mode == ""){
            this.mode = "local";
            System.out.println("Mode : "+this.mode);
        } else {
            this.mode = mode;
            System.out.println("Mode : "+this.mode);
        }
        return this.mode;
    }

    public DesiredCapabilities getDesireCapabilities(String browser){
        caps = new DesiredCapabilities();
        if (browser.equalsIgnoreCase("chrome")){
            caps = DesiredCapabilities.chrome();
            caps.setBrowserName("chrome");
        }
        if (browser.equalsIgnoreCase("firefox")){
            caps = DesiredCapabilities.firefox();
            caps.setBrowserName("firefox");
        }
        if (browser.equalsIgnoreCase("internet explorer")){
            caps = DesiredCapabilities.internetExplorer();
            caps.setBrowserName("internet explorer");
        }
        if (browser.equalsIgnoreCase("edge")){
            caps = DesiredCapabilities.edge();
            caps.setBrowserName("MicrosoftEdge");
        }
        if (browser.equalsIgnoreCase("safari")){
            caps = DesiredCapabilities.safari();
            caps.setBrowserName("safari");
        }
        return caps;
    }

    public String getIpAddress(){
        String ipAddress = System.getProperty("ipaddress");
        if (ipAddress == null || ipAddress == ""){
            this.ipAddress = "10.10.30.146:4444";
        }else
            this.ipAddress = ipAddress;
        return this.ipAddress;
    }

    private RemoteWebDriver getRemoteDriver(String browser){
        caps = getDesireCapabilities(browser);
        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions cOptions = new ChromeOptions();
            caps.setCapability("chromeOption",cOptions);
        }

        try {
            driver = new RemoteWebDriver(new URL("http://"+ipAddress+"/wd/hub"), caps);
        } catch (MalformedURLException ex){
            System.out.println("driver is not initialising");
        }
        return driver;
    }

    private void getDriversPath(String platform,String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            if (platform.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "src/test/drivers/" + platform + "/chromedriver.exe");
            } else
                System.setProperty("webdriver.chrome.driver", "src/test/drivers/" + platform + "/chromedriver");
        }

        if (browser.equalsIgnoreCase("firefox")) {
            if (platform.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "src/test/drivers/" + platform + "/geckodriver.exe");
            } else
                System.setProperty("webdriver.gecko.driver", "src/test/drivers/" + platform + "/geckodriver");
        }

        if (browser.equalsIgnoreCase("internet explorer")) {
            System.setProperty("webdriver.ie.driver", "src/test/drivers/" + platform + "/IEDriverServer.exe");
        }

        if (browser.equalsIgnoreCase("MicrosoftEdge")) {
            System.setProperty("webdriver.egde.driver", "src/test/drivers/" + platform + "/MicrosoftWebDriver.exe");
        }
    }
}
