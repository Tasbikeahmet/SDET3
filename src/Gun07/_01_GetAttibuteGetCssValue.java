package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

import java.util.WeakHashMap;

public class _01_GetAttibuteGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));


        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));

        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("background"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("height"));


        BekleKapat();
    }
}
