package advanced;

/**
 * Created by dell on 11/5/17.
 */
public class MyClass {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("firefox url");

        driver = new ChromeDriver();
        driver.get("chrome driver");
    }
}
