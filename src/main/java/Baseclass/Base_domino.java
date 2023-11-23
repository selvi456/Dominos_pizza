package Baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Base_domino {

    public static WebDriver driver;

    public static void javaclick(WebDriver driver, WebElement ref){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ref);
    }





    public static void draganddrop(WebDriver driver,WebElement s,WebElement d){
        Actions a=new Actions(driver);
        a.dragAndDrop(s,d).perform();


    }

    public static void click(WebElement cli){
        cli.click();
    }


    public static void alert(WebDriver driver){
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }

    public static void alertd(WebDriver driver){
        Alert alertd=driver.switchTo().alert();
        alertd.dismiss();
    }



    public static void Enter(WebDriver driver, WebElement ref) throws AWTException {
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }



    public static void getWindowHandles(WebDriver driver) {
        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
    }


    public static void chooseById(WebElement ref,int id){
        Select s=new Select(ref);
        s.selectByIndex(id);

    }
    public static void chooseByValue(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByValue(value);

    }
    public static void chooseByVisible(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByVisibleText(value);

    }

    public static void Backspace(WebDriver driver, WebElement ref) throws AWTException {
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
    }

    public static void scrolldown(WebDriver driver, WebElement refe){
        JavascriptExecutor js1=(JavascriptExecutor) driver ;
        js1.executeScript("arguments[0].scrollIntoView()",refe);
    }
}
