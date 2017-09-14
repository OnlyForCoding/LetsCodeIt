package Frames;

import basepkg.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jitendra on 13/9/17.
 */
public class Frames extends BaseClass {

    @Test
    public void nestedFrames(){
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        String text = driver.findElement(By.id("content")).getText();
        Assert.assertEquals(text,"MIDDLE");
    }

    @Test
    public void iFrame(){
        driver.get("http://the-internet.herokuapp.com/tinymce");
        driver.switchTo().frame("mce_0_ifr");
        WebElement editor = driver.findElement(By.id("tinymce"));
        String beforeText = editor.getText();
        System.out.println("beforeText : "+beforeText);
        editor.clear();
        editor.sendKeys("Hello Jitu...");
        String afterText = editor.getText();
        Assert.assertNotEquals(beforeText,afterText);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("mceu_15-open"));
    }
}
