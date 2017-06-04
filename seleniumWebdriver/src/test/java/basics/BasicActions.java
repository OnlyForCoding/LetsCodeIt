package basics;

import basepkg.BaseClass;
import org.testng.annotations.Test;

/**
 * Created by dell on 4/6/17.
 */
public class BasicActions extends BaseClass {

    @Test
    public void basicActions() throws InterruptedException {
        driver.get("https://www.google.co.in/");
        System.out.println("Title : "+driver.getTitle());
        System.out.println("Current url :"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().to("https://mail.google.com");
        System.out.println("Title : "+driver.getTitle());
        System.out.println("Current url :"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Title : "+driver.getTitle());
        System.out.println("Current url :"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("Title : "+driver.getTitle());
        System.out.println("Current url :"+driver.getCurrentUrl());
        Thread.sleep(2000);
    }
}
