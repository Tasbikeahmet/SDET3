package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilis.BaseStaticDriver;

public class _01_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Bekle(2);
        WebElement element1 = driver.findElement(By.cssSelector("[id$='4586_0']"));
      element1.click();
        Bekle(2);
        WebElement element2 = driver.findElement(By.cssSelector("[id$='4588']"));
        element2.click();
        Bekle(2);
        WebElement element3 = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        element3.click();
        Bekle(2);
        WebElement element4 = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        element4.click();
        WebElement element7 = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        element7.click();
        Bekle(2);
        WebElement asd = driver.findElement(By.cssSelector("[id='u_LsN_4597']"));
        asd.click();
        Bekle(2);
        WebElement element6 = driver.findElement(By.cssSelector("[id='u_LsN_4597'] > :nth-child(4)"));
        element6.click();




BekleKapat();
    }
}
